package main;

import java.util.Scanner;

import service.Longest;

public class LongestMain {

	public static void main(String[] args) {
		Longest longestWord = new Longest();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sentence: ");
		String sentence = sc.nextLine();
		System.out.println(longestWord.longestWord(sentence));
		sc.close();
	}
}
