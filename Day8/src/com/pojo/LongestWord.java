package com.pojo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LongestWord {
	 private String longestWord = "";
    private String current;
	public String getLongestWords() throws IOException {
	    Scanner sc = new Scanner(new File("/D:\\Assignment/sample2.txt"));


	    while (sc.hasNext()) {
	        current = sc.next();
	        if (current.length() > longestWord.length()) {
	            longestWord = current;

	        }

	    }
	    return longestWord;

	}

}
