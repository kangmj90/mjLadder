package com.mj.ladder.member;

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
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.NotEmpty;

import com.mj.ladder.game.Ladder;
import com.mj.ladder.game.MemberLadder;
import com.mj.ladder.result.Result;

import lombok.Data;

@Entity
@DynamicUpdate
@Table(name="member")
@Data
public class Member{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seq;
	
	@Column
	private String id;
	
	@Column
	private String name;
	
	@Column
	private String team;
	
	@Column
	private String position;
	
	@Column
	private Date regDate;
	
	@Column(updatable=false)
	private Date modDate;
	
	@PrePersist
	public void prePersist () {
		regDate = new Date();
		modDate = new Date();
	}
	
	@PreUpdate
	public void preUpdate() {
		modDate = new Date();
	}
	
	@OneToMany(mappedBy = "memberSeq")
//	private List<MemberLadder> memberLadder;
	private List<Result> ladderResults = new ArrayList<Result>();
	
}
