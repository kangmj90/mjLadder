package com.mj.ladder.oop;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
	
	public static int startRow = 0;
	public static List<LadderPoint> ladderPointList = new ArrayList<LadderPoint>();
	public static int maxRow;

	public void setLadderPoint(int row, int col) {

		setLadderRight(row, col);
		setLadderLeft(row, col);
		
	}
	
	public void setLadderRight(int row, int col) {

		LadderPoint ladderPoint = new LadderPoint();
		ladderPoint.setCol(col);
		ladderPoint.setRow(row);
		ladderPoint.setDirection(Direction.RIGHT);
		ladderPointList.add(ladderPoint);
	}
	
	public void setLadderLeft(int row, int col) {

		LadderPoint ladderPoint = new LadderPoint();
		ladderPoint.setCol(col+1);
		ladderPoint.setRow(row);
		ladderPoint.setDirection(Direction.LEFT);
		ladderPointList.add(ladderPoint);
	}
		
	
	public Member playLadder(Member member) {
		
		return getLadderPoint(startRow, member);
		
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
	
	public Direction comparePoint(int row, int col) {
		
		Direction direction = Direction.DOWN;
		
		for (LadderPoint ladderPoint : ladderPointList) {
			
				if ((col == ladderPoint.getCol()) && (row ==  ladderPoint.getRow()))  {
					direction = ladderPoint.getDirection(); 
					break;
				}
		}
		return direction;
	}
	
	public int setMaxRow() {
		int row = 0;

		for(LadderPoint ladderPoint : ladderPointList) {
			row = Math.max(ladderPoint.getRow(), row);
		}
		
		return row;
	}
	
	public Member getLadderPoint(int row, Member member) {
		
		int col = member.getPosition();
		
		while(row <= setMaxRow()) {
			
			Direction direction = comparePoint(row, col);

			switch (direction.toString()) {
			case "RIGHT" : 
				col = moveRight(col);
				break;
				
			case "LEFT" :
				col = moveLeft(col);
				break;
				
			}
			row = moveDown(row);
			
		}
		
			
		LadderPoint ladderPoint = new LadderPoint();
		ladderPoint.setCol(col);
		ladderPoint.setRow(row);
		
		member.setPosition(col);
		
		return member;
	}
}
