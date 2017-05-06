package com.mj.ladder.game;

import java.util.List;

public interface LadderService {


	public List<Ladder> getLadderList();
	
	public Ladder getLadder(int seq);
}
