package com.main;

import java.util.Scanner;

import com.pojo.ReplaceCharacter;

public class ReplaceCharacterMain {

	public static void main(String[] args) {
		ReplaceCharacter replaceCharacter = new ReplaceCharacter();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		System.out.println("Before conversion :" + sentence);
		System.out.println("After conversion :" + replaceCharacter.replaceCharacter(sentence.toLowerCase()));
		sc.close();
		replaceCharacter = null;

	}

}
