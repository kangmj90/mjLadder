package com.mj.ladder.oop;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
	
	public static int startRow = 0;
	public static List<LadderPoint> ladderPointList = new ArrayList<LadderPoint>();
	public static int maxRow;

	public void setLadderPoint(int col, int row) {

		setLadderRight(col, row);
		setLadderLeft(col, row);
		
	}
	
	public void setLadderRight(int col, int row) {

		LadderPoint ladderPoint = new LadderPoint();
		ladderPoint.setCol(col);
		ladderPoint.setRow(row);
		ladderPoint.setDirection(Direction.RIGHT);
		ladderPointList.add(ladderPoint);
	}
	
	public void setLadderLeft(int col, int row) {

		LadderPoint ladderPoint = new LadderPoint();
		ladderPoint.setCol(col-1);
		ladderPoint.setRow(row);
		ladderPoint.setDirection(Direction.LEFT);
		ladderPointList.add(ladderPoint);
	}
		
	
	public LadderPoint playLadder(Member member) {
		
		int position = member.getPosition();
		
		return getLadderPoint(position, startRow);
		
	}
	
	public int moveDown(int row) {
		return row+1;
	}
	
	public int moveLeft(int col) {
		return col-1;
	}
	
	public int moveRight(int col) {
		return col+1;
	}
	
	public Direction comparePoint(int col, int row) {
		
		Direction direction = Direction.DOWN;
		
		for (LadderPoint ladderPoint : ladderPointList) {
			if ((col == ladderPoint.getCol()) && (row ==  ladderPoint.getRow())) direction = ladderPoint.getDirection(); break;
		}
		return direction;
	}
	
	public LadderPoint getLadderPoint(int col, int row) {
		
			Direction direction = comparePoint(col, row);
			
			switch (direction.toString()) {
			case "RIGTH" : 
				col = moveRight(col);
				break;
				
			case "LEFT" :
				col = moveLeft(col);
				break;
				
			default : 
				row = moveDown(row);
				break;
			}
			
		LadderPoint ladderPoint = new LadderPoint();
		ladderPoint.setCol(col);
		ladderPoint.setRow(row);
		
		return ladderPoint;
	}
}
