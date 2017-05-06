package com.mj.ladder.game;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LadderController {


	@Autowired
	LadderService service;
	
	private static Logger logger = LoggerFactory.getLogger(LadderController.class);
	

	@RequestMapping(value = "/ladders", method = RequestMethod.GET)
	public @ResponseBody List<Ladder> getLadderList() {
		logger.debug("logger debug game");
		return service.getLadderList();
	}
	
	@RequestMapping(value = "/ladders/{seq}", method = RequestMethod.GET)
	public @ResponseBody Ladder getLadder(@PathVariable int seq) {
		logger.debug("logger debug");
		return service.getLadder(seq);
	}
}
