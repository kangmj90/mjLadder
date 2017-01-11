package com.mj.ladder.member;

import java.util.List;

public interface MemberService {

	public List<Member> getMemberList();
	
	public Member getMember(int seq);
	
	public List<Member> getMemberByLikeId(String id);
	
	public List<Member> getMemberByTearmLike(String tearm);
	
	public Member insertMember(Member member);
	
	public Member updateMember(Member member);
	
	public void deleteMember(int seq);
}
