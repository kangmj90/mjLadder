package com.mj.ladder.oop;

public class LadderMain {
	
	public static void main(String[] args) {
		
		example();
	}
	
	public static void example() {
		
		Ladder ladder = new Ladder();
		
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
		
		Member member = new Member();
		
		/**
		 * 사용자 지정
		 */
		member.setPosition(1);
		member.setUserName("강민정");
		
		/**
		 * 사다리 시
		 */
		LadderPoint ladderPoint = ladder.playLadder(member);
		System.out.println(ladderPoint);
		
	}
}
