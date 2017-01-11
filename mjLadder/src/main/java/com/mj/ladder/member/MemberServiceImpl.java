package com.mj.ladder.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	private MemberRepository repository;
	
	@Override
	public List<Member> getMemberList() {
		return repository.findAll();
	}
	
	@Override
	public Member getMember(int seq) {
		return repository.findOne(seq);
	}

	@Override
	public List<Member> getMemberByLikeId(String id) {
		return repository.findByLikeId(id);
	}
	
	@Override
	public List<Member> getMemberByTearmLike(String tearm) {
		return repository.findByTeamLike(tearm);
	}
	
	@Override
	public Member insertMember(Member member) {
		return repository.save(member);
	}

	@Override
	public Member updateMember(Member member) {
		return repository.save(member);
	}

	@Override
	public void deleteMember(int seq) {
		 repository.delete(seq);
	}

}
