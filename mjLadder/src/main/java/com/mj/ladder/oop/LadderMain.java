package com.mj.ladder.oop;

import java.util.ArrayList;
import java.util.List;

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
		
		List<Member> memberList = new ArrayList<Member>();
		memberList.add(new Member(1, "똘기"));
		memberList.add(new Member(2, "떵이"));
		memberList.add(new Member(3, "호치"));
		memberList.add(new Member(4, "새초미"));
		memberList.add(new Member(5, "드라고"));
		memberList.add(new Member(6, "요롱이"));

		for (Member m : memberList) {
			
			System.out.println(ladder.playLadder(m));
		}
		
	}
}
