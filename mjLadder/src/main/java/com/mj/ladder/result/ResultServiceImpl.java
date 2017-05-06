package com.mj.ladder.result;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mj.ladder.game.Ladder;
import com.mj.ladder.game.LadderRepository;
import com.mj.ladder.member.Member;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	ResultRepository resultRepository;
	
	@Autowired
	LadderRepository ladderRepository;

	@Override
	public Result insertResults(Member member, Ladder ladder) {
		Result results = new Result();
		if (ladderRepository.save(ladder) != null) {
			results.setMemberSeq(member);
			results.setLadderSeq(ladder);
			
			resultRepository.save(results);
		}
		return results;
	}
	
}
