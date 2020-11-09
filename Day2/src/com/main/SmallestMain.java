package com.main;

import java.util.Scanner;

import com.pojo.Smallest;

public class SmallestMain {

	public static void main(String[] args) {
		Smallest smallest = new Smallest();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number1: ");
		int number1 = sc.nextInt();
		System.out.println("Enter the number2: ");
		int number2 = sc.nextInt();
		System.out.println("Enter the number3: ");
		int number3 = sc.nextInt();
		System.out.println(smallest.Smaller(number1, number2, number3));
		sc=null;
		smallest=null;

	}

}
