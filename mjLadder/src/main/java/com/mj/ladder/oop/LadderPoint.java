package com.mj.ladder.oop;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class LadderPoint {

	int row;

	int col;
	
	Direction direction;
}
