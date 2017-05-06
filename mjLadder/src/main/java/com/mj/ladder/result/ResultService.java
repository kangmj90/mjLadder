package com.mj.ladder.result;

import com.mj.ladder.game.Ladder;
import com.mj.ladder.member.Member;

public interface ResultService {
	
	public Result insertResults(Member member, Ladder ladder);
}
