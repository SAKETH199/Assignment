package com.pojo;

public class PaybackCard extends Card {
	private int pointsEarned;
	private double totalAmount;
	private int getPointsEarned() {
		return pointsEarned;
	}
	private void setPointsEarned(int pointsEarned) {
		this.pointsEarned = pointsEarned;
	}
	private double getTotalAmount() {
		return totalAmount;
	}
	private void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	private PaybackCard(int pointsEarned, double totalAmount) {
		super();
		this.pointsEarned = pointsEarned;
		this.totalAmount = totalAmount;
	}
	


}
