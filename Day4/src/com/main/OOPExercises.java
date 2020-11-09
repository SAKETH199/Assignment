package com.main;

import com.pojo.A;

public class OOPExercises {
	public static void main(String[] args) {
		A objA = new A();
		System.out.println("in main(): ");
		objA.setA(222);
		System.out.println("objA.a = " + objA.getA());
	}
}