package com.main;

import java.util.Scanner;

import com.pojo.Circle;
import com.pojo.Rectangle;
import com.pojo.Square;

public class Main {

	public static void main(String[] args) {
		Circle circle = new Circle("circle", 3);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the shape name :");
		String name = sc.nextLine();
		circle.setName(name);
		System.out.println("Enter the radius :");
		int radius = sc.nextInt();
		circle.setRadius(radius);
		circle.getName();
		circle.getRadius();
		System.out.println("Area of circle is " + circle.calculateArea());

		Square square = new Square("square", 4);
		System.out.println("Enter the shape name :");
		String name1 = sc.nextLine();
		square.setName(name1);
		System.out.println("Enter the side :");
		int side = sc.nextInt();
		square.setSide(side);
		square.getName();
		square.getSide();
		System.out.println("Area of square is " + square.calculateArea());

		Rectangle rectangle = new Rectangle("rectangle", 3, 3);
		System.out.println("Enter the shape name :");
		String name2 = sc.nextLine();
		rectangle.setName(name2);
		System.out.println("Enter the length :");
		int length = sc.nextInt();
		System.out.println("Enter the breadth :");
		int breadth = sc.nextInt();
		rectangle.setLength(length);
		rectangle.setBreadth(breadth);
		rectangle.getName();
		rectangle.getLength();
		rectangle.getBreadth();
		System.out.println("Area of rectangle is " + rectangle.calculateArea());
		sc.close();
		circle = null;
		rectangle = null;
		square = null;
	}

}
