package com.mj.ladder.member;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface MemberRepository extends JpaRepository<Member, Integer> {
	
	@Query(value= "SELECT * FROM member WHERE id LIKE %:id%", nativeQuery=true)
	public List<Member> findByLikeId(@Param("id") String id);
	
	public List<Member> findByTeamLike(String tearm);

}
