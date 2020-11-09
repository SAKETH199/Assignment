package com.pojo;

public class MemberShipCard extends Card{
	private int rating;

	private int getRating() {
		return rating;
	}

	private void setRating(int rating) {
		this.rating = rating;
	}

	private MemberShipCard(int rating) {
		super();
		this.rating = rating;
	}


	

}
