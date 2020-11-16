package com.main;

import java.io.IOException;

import com.pojo.LongestWord;

public class LongestWordMain {

	public static void main(String[] args) throws IOException {

		LongestWord longestWord = new LongestWord();
		System.out.println("Longest word in the file :" + longestWord.getLongestWords());

	}

}
