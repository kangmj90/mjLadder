package com.mj.ladder.modify;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@AllArgsConstructor
public class Member {

	private int startPosition;
	
	private int endPosition;
	
	private String name;
}
