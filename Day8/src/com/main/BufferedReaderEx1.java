package com.main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class BufferedReaderEx1 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter your name: ");
		StringBuffer sb = new StringBuffer("Hello HCL! ");
		try {
			sb.append(br.readLine());
			br.close();
			System.out.println(sb);
		} catch (Exception e) {
			System.out.println("Exception " + e);
		}

	}

}
