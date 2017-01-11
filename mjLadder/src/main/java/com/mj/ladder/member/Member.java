package com.mj.ladder.member;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.validator.constraints.NotEmpty;

import lombok.Data;

@Entity
@DynamicUpdate
@Table(name="member")
@Data
public class Member{


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int seq;
	
	@Column @NotEmpty
	private String id;
	
	@Column @NotEmpty
	private String name;
	
	@Column @NotEmpty
	private String team;
	
	@Column @NotEmpty
	private String position;
	
	@Column @NotEmpty
	private Date regDate;
	
	@Column @NotEmpty
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
	
}
