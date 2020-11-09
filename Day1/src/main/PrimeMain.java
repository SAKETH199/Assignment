package main;

import java.util.Scanner;

import service.Prime;

public class PrimeMain {

	public static void main(String[] args) {
		Prime prime = new Prime();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int number = sc.nextInt();
		System.out.println(prime.prime(number));

	}

}
