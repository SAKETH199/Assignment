package com.pojo;

public class Square extends Shape {
	private int side;

	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public Square(String name, int side) {
		super(name);
		this.side = side;
	}

	@Override
	public float calculateArea() {
		float area;
		area = side * side;
		return area;
	}

}
