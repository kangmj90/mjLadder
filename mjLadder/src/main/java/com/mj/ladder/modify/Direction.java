package com.mj.ladder.modify;

public enum Direction {

	LEFT() {
		int movePoint() {
			return -1;
		}
	}, RIGHT() {
		int movePoint() {
			return 1;
		}
	}, DOWN() {
		int movePoint() {
			return 0;
		}
	};
	
	abstract int movePoint();
	
}
