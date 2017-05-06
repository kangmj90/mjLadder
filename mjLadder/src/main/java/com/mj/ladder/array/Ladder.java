package com.mj.ladder.array;


public class Ladder {

	/**
	 * 0 : 아래로 이동
	 * 1 : 오른쪽으로 이동
	 * -1 : 왼쪽으로 이동
	 */
	private int[][] ladderMove;
	
	private final static int startRow = 0;
	
	public void setLadder(int row, int col) {
		ladderMove = new int[row+1][col];
	}
	
	public void setLadderPoint(int x, int y) {
		ladderMove[x][y-1] = 1;
		ladderMove[x][y] = -1;
	}
	
	public void ladderLine(int col) {
		
		int x = startRow;
		int y = col;
		for (int i=0 ; i<ladderMove.length ; i++) {
			
			switch (ladderMove[x][y]) {
			
			case (1) : y++; break;
			case (-1) : y--; break;
			
			}
			x++;
//			System.out.println("[x] : " + x + " [y] : " + y);
		}
		col++;
		y++;
		System.out.println("최종 결과 - [x] : " + col + " [y] : " + y);
		
	}
}
