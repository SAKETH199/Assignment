package com.pojo;

public class Circle extends Shape {
	private int radius;
	private final float pi = 3.14f;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public float calculateArea() {
		float area = pi * radius * radius;
		return area;
	}

	public Circle(String name, int radius) {
		super(name);
		this.radius = radius;
	}
}
