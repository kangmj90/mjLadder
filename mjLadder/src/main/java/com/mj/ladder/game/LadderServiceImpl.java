package com.mj.ladder.game;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LadderServiceImpl implements LadderService {

	@Autowired
	LadderRepository ladderRepository;

	@Override
	public List<Ladder> getLadderList() {
		return ladderRepository.findAll();
	}

	@Override
	public Ladder getLadder(int seq) {
		return ladderRepository.findOne(seq);
	}
}
