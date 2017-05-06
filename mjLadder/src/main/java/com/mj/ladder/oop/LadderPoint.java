package com.mj.ladder.oop;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class LadderPoint {

	int col;
	
	int row;
	
	Direction direction;
}
