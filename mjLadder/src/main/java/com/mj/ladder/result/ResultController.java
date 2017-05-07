package com.mj.ladder.result;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mj.ladder.game.Ladder;
import com.mj.ladder.member.Member;

@Controller
public class ResultController {

	@Autowired
	ResultService service;
	
	private static Logger logger = LoggerFactory.getLogger(ResultController.class);
	
	@RequestMapping(value = "/results", method = RequestMethod.POST)
	public @ResponseBody Result insertLadder(Member member, Ladder ladder) {
		logger.debug("member : ", member);
		return service.insertResults(member, ladder);
	}
	
}
