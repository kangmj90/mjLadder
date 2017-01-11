package com.mj.ladder.member;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mj.ladder.member.dto.MemberRegistDto;

@Controller
public class MemberController {

	private static Logger logger = LoggerFactory.getLogger(MemberController.class);
	@Autowired
	MemberService service;
	
	@RequestMapping(value = "/members", method = RequestMethod.GET)
	public @ResponseBody List<Member> getMemberList() {
		logger.debug("logger debug");
		return service.getMemberList();
	}
	
	@RequestMapping(value = "/members/{seq}", method = RequestMethod.GET)
	public @ResponseBody Member getMember(@PathVariable int seq) {
		logger.debug("logger debug");
		return service.getMember(seq);
	}
	
	@RequestMapping(value = "/memberId/{id}", method = RequestMethod.GET)
	public @ResponseBody List<Member> getMemberByLikeId(@PathVariable String id) {
		return service.getMemberByLikeId(id);
	}
	
	@RequestMapping(value = "/memberTeam/{team}", method = RequestMethod.GET)
	public @ResponseBody List<Member> getMemberByTearmLike(@PathVariable String team) {
		return service.getMemberByTearmLike(team);
	}
	
	@RequestMapping(value = "/members", method = RequestMethod.POST)
	public @ResponseBody Member insertMember(Member member) {
		return service.insertMember(member);
	}
	
	@RequestMapping(value = "/members/{seq}", method = RequestMethod.PUT)
	public @ResponseBody Member updateMember(@RequestBody Member member) {
		return service.updateMember(member);
	}
	
	@RequestMapping(value = "/members/{seq}", method = RequestMethod.DELETE)
	public @ResponseBody void deleteMember(@PathVariable int seq) {
		service.deleteMember(seq);
	}
}
