package com.main;

import java.util.Scanner;

import com.pojo.Addition;

public class AdditionMain {

	public static void main(String[] args) {
		Addition addition = new Addition();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements to add: ");
		int number = sc.nextInt();
		int a[] = new int[number];
		System.out.println("Enter elements: ");
		for (int i = 0; i < number; i++) {
			a[i] = sc.nextInt();

		}
		addition.displayAddition(a);
		sc = null;
		addition = null;
	}

}
