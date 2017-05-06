package com.mj.ladder.array;

public class LadderMain {

	public static void main(String[] args) {
		
		example1();
		
		
	}
	
	public static void example1() {
		
		Ladder ladder = new Ladder();
		
		/**
		 * 사다리 총 개수
		 */
		ladder.setLadder(10, 6);
		
		/**
		 * 위치값 저장
		 */
		ladder.setLadderPoint(1, 1);
		ladder.setLadderPoint(6, 1);
		ladder.setLadderPoint(9, 1);
		ladder.setLadderPoint(3, 2);
		ladder.setLadderPoint(5, 2);
		ladder.setLadderPoint(8, 2);
		ladder.setLadderPoint(4, 3);
		ladder.setLadderPoint(7, 3);
		ladder.setLadderPoint(10, 3);
		ladder.setLadderPoint(2, 4);
		ladder.setLadderPoint(6, 4);
		ladder.setLadderPoint(8, 4);
		ladder.setLadderPoint(3, 5);
		ladder.setLadderPoint(5, 5);
		ladder.setLadderPoint(7, 5);
		
		ladder.ladderLine(0);
		ladder.ladderLine(1);
		ladder.ladderLine(2);
		ladder.ladderLine(3);
		ladder.ladderLine(4);
		ladder.ladderLine(5);
//		ladder.ladderLine(6);
		
	}
	
}
