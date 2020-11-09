package com.main;

import java.util.Scanner;

import com.pojo.Reverse;

public class ReverseMain {

	public static void main(String[] args) {
		Reverse reverse = new Reverse();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String word = sc.nextLine();
		reverse.reShape(word);
		reverse = null;
		sc.close();

	}

}
