package com.main;

import java.util.Scanner;

import com.pojo.Ascending;

public class AscendingMain {

	public static void main(String[] args) {
		Ascending ascending = new Ascending();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements for sorting : ");
		int number = sc.nextInt();
		int sort[] = new int[number];
		System.out.println("Enter elements: ");
		for (int i = 0; i < number; i++) {
			sort[i] = sc.nextInt();

		}
		ascending.ascending(sort);
		sc = null;
		ascending = null;

	}

}
