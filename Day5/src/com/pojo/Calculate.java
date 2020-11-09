package com.pojo;

public class Calculate {
	private float runRate;

	public void calculateRunrate(int runs, float overs) {
		try {
			runRate = runs / overs;
			System.out.println("Runrate: " + runRate);
		} catch (Exception e) {
			System.out.println("Error Code: " + e);
		}
	}
}
