package main;

import java.util.Scanner;

import service.Calculator;

public class CalculatorMain {

	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number1 :");
		float number1 = sc.nextFloat();
		System.out.println("Enter number2: ");
		float number2 = sc.nextFloat();
		System.out.println("Addition of given numbers: " + calculator.addition(number1, number2));
		System.out.println("Subtraction of given numbers: " + calculator.subtraction(number1, number2));
		System.out.println("Multiplication of given numbers: " + calculator.multiplication(number1, number2));
		System.out.println("Division of given numbers: " + calculator.division(number1, number2));
		System.out.println("ModuloDivision of given numbers: " + calculator.moduloDivision(number1, number2));

	}

}
