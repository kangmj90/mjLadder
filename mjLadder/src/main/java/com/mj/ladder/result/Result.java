package com.mj.ladder.result;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.mj.ladder.game.Ladder;
import com.mj.ladder.member.Member;

import lombok.Data;

@Entity
@Table(name = "ladderResult")
@Data
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seq;
	
	@ManyToOne
	@JoinColumn(name = "seq", insertable=false, updatable=false)
	private Member memberSeq;
	
	@ManyToOne
	@JoinColumn(name = "seq", insertable=false, updatable=false)
	private Ladder ladderSeq;
	
	@Column
	private String ladderName;
}
