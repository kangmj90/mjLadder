package com.mj.ladder.game;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.mj.ladder.result.Result;

import lombok.Data;

@Entity
@Table(name="ladder")
@Data
public class Ladder {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seq;
	@Column
	private int term;
	@Column
	private Date regDate;
	
	@PrePersist
	public void prePersist () {
		regDate = new Date();
	}
	
	@OneToMany(mappedBy = "ladderSeq")
//	private List<MemberLadder> memberLadder;
	private List<Result> ladderResults = new ArrayList<Result>();
}
