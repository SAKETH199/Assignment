package com.main;

import java.util.Scanner;

import com.pojo.DisplaySubString;

public class displaySubStringMain {

	public static void main(String[] args) {

		DisplaySubString display = new DisplaySubString();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string : ");
		String word = sc.nextLine();
		System.out.println("Enter the starting index :");
		int start = sc.nextInt();
		System.out.println("Enter the end index :");
		int end = sc.nextInt();
		System.out.println("Substring is :" + display.printSubString(word, start, end));
		sc.close();
		display = null;

	}

}
