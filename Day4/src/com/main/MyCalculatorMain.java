package com.main;

import java.util.Scanner;

import com.pojo.MyCalculator;

public class MyCalculatorMain {

	public static void main(String[] args) {
		MyCalculator calculator = new MyCalculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println("I implemented: " + "AdvancedArithmetic");
		System.out.println(calculator.divisor_sum(number));
		sc.close();
		calculator = null;
	}

}
