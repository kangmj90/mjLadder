package com.mj.ladder.oop;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
public class LadderTest {
	
	@Test
	public void getMemberPosition() {
		Member member = new Member();
		member.setPosition(1);
		member.setUserName("User1");
	}
}
