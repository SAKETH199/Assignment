package com.pojo;

public abstract class Card {
public String cardNumber;
public String expiryDate;
public String HolderName;
private Card() {
	super();
	this.cardNumber = cardNumber;
	this.expiryDate = expiryDate;
	HolderName = holderName;
}
private String getCardNumber() {
	return cardNumber;
}
private void setCardNumber(String cardNumber) {
	this.cardNumber = cardNumber;
}
private String getExpiryDate() {
	return expiryDate;
}
private void setExpiryDate(String expiryDate) {
	this.expiryDate = expiryDate;
}
private String getHolderName() {
	return HolderName;
}
private void setHolderName(String holderName) {
	HolderName = holderName;
}
}
