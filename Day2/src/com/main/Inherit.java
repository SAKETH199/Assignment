package com.main;

import com.pojo.B;

public class Inherit {

	public static void main(String[] args) {
		B b = new B();
		System.out.println(b.display());
		System.out.println(b.print());
		b = null;

	}

}
