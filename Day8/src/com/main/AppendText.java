package com.main;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class AppendText {

	public static void main(String[] args) throws IOException {
		File file = new File("/D:\\Assignment/sample3.txt");
		FileWriter fr = new FileWriter(file);
		try {
			BufferedWriter br = new BufferedWriter(fr);
			br.write("JAVA");
			br.close();
			fr.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
