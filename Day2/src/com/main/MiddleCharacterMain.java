package com.main;

import java.util.Scanner;

import com.pojo.MiddleCharacter;

public class MiddleCharacterMain {

	public static void main(String[] args) {
		MiddleCharacter middleCharacter = new MiddleCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String word = sc.nextLine();
		System.out.println("The middle character of given string: " + middleCharacter.middle(word));
		sc = null;
		middleCharacter = null;

	}

}
