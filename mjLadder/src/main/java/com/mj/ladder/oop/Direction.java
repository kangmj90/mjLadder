package com.mj.ladder.oop;

public enum Direction {

	LEFT("LEFT"), RIGHT("RIGHT"), DOWN("DOWN");
	
	private String name;
	
	Direction(final String name) {
		this.name = name;
	}
	
	public String getString(){
		return name;
	}


	public static void main(String[] args) {
		System.out.println("" + Direction.LEFT.hashCode());
		System.out.println("" + Direction.LEFT.getClass().getSimpleName());
	}
}
