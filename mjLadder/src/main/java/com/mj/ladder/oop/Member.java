package com.mj.ladder.oop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Member {

	private int position;
	
	private String userName;
}
