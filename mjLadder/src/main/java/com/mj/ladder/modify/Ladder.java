package com.mj.ladder.modify;

import java.util.ArrayList;
import java.util.List;

public class Ladder {
	
	public static int startRow = 0;
	public static List<Point> ladderPointList = new ArrayList<Point>();

	public void setLadderPoint(int row, int col) {

		setLadderRight(row, col);
		setLadderLeft(row, col);
	}
	
	public void setLadderRight(int row, int col) {

		Point ladderPoint = new Point(row, col, Direction.RIGHT);
		ladderPointList.add(ladderPoint);
		
	}
	
	public void setLadderLeft(int row, int col) {

		Point ladderPoint = new Point(row, col+1, Direction.LEFT);
		ladderPointList.add(ladderPoint);
	}
	
	public Direction comparePoint(int row, int col) {
		
		Direction direction = Direction.DOWN;
		
		for (Point ladderPoint : ladderPointList) {
			
				if ((col == ladderPoint.getCol()) && (row ==  ladderPoint.getRow()))  {
					direction = ladderPoint.getDirection(); 
					break;
				}
		}
		return direction;
	}
	
	public int setMaxRow() {
		int row = 0;

		for(Point ladderPoint : ladderPointList) {
			row = Math.max(ladderPoint.getRow(), row);
		}
		
		return row;
	}
	
	/**
	 * 시작 위치에서 종료 위치까지 사다리 이동
	 * @param row
	 * @param member
	 * @return
	 */
	public Member getLadderPoint(int row, Member member) {
		
		int col = member.getStartPosition();
		
		while(row <= setMaxRow()) {
			
			Direction direction = comparePoint(row, col);

			col = col +  direction.movePoint();
			row++;
			
		}
		
		member.setEndPosition(col);
		
		return member;
	}
	
	/**
	 * 게임 시작
	 * @param member
	 * @return
	 */
	public Member playLadder(Member member) {
		return getLadderPoint(startRow, member);
	}
}
