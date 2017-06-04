package com.mj.ladder.modify;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Point {

	private int row;

	private int col;
	
	private Direction direction;
	
	public Point (int r, int c, Direction d) {
		row = r;
		col = c;
		direction = d;
	}
}
