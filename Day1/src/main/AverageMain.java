package main;

import java.util.Scanner;

import service.Average;

public class AverageMain {

	public static void main(String[] args) {
		Average average = new Average();
		Scanner s = new Scanner(System.in);
		System.out.println("Enter number1: ");
		float number1 = s.nextFloat();
		System.out.println("Enter number2: ");
		float number2 = s.nextFloat();
		System.out.println("Enter number3: ");
		float number3 = s.nextFloat();
		System.out.println("Average of given numbers : " + average.average(number1, number2, number3));

	}

}
