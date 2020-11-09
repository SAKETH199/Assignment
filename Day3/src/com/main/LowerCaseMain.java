package com.main;

import java.util.Scanner;

import com.pojo.LowerCase;

public final class LowerCaseMain {

	public static void main(String[] args) {
		LowerCase lowercase = new LowerCase();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		System.out.println("AFter converting to Lower case: " + lowercase.convertTo(sentence));
		sc.close();
		lowercase = null;
	}

}
