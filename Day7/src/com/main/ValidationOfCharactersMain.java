package com.main;

import java.util.Scanner;

import com.pojo.ValidationOfCharacters;

public class ValidationOfCharactersMain {

	public static void main(String[] args) {
		ValidationOfCharacters validation = new ValidationOfCharacters();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String :");
		String word = sc.nextLine();
		int value = validation.checkCharacters(word);
		if (value == 1) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}

}
