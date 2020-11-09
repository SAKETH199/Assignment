package com.main;

import java.io.File;
import java.io.FileInputStream;

public class CheckedException {
	public static void main(String args[]) {
		try {

			File file = new File("D:\\sample.txt");
			FileInputStream fis = new FileInputStream(file);
			System.out.println("file content: ");
			int r = 0;
			while ((r = fis.read()) != -1) {
				System.out.print((char) r);
			}
			fis.close();
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}