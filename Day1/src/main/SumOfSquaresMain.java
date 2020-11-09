package main;

import java.util.Scanner;

import service.SumOfSquares;

public class SumOfSquaresMain {

	public static void main(String[] args) {

		SumOfSquares sumOfSquares = new SumOfSquares();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number :");
		int number = sc.nextInt();
		System.out.println("Sum of squares :" + sumOfSquares.sumOfSquaresOfEvenDigits(number));
		sc = null;
		sumOfSquares = null;
	}

}
