package com.mj.ladder.game;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.mj.ladder.member.Member;

import lombok.Data;

@Entity
@Data
@IdClass(MemberLadderId.class)
public class MemberLadder {
	
	@Id
	@ManyToOne
	@JoinColumn(name = "seq", insertable=false, updatable=false)
	private Member memberSeq;
	
	@Id
	@ManyToOne
	@JoinColumn(name = "seq", insertable=false, updatable=false)
	private Ladder ladderSeq;
	
	private String ladderName;
}
