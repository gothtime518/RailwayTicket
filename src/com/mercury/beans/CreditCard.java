package com.mercury.beans;

public class CreditCard {
	private int cardId;
	private int userId;
	private String cardNo;
	private String paymentBrand;
	private String firstName;
	private String lastName;
	private String expiration;
	private String street;
	private String city;
	private int zipCode;
	private String state;
	
	public int getCardId() {
		return cardId;
	}
	public void setCardId(int cardId) {
		this.cardId = cardId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getPaymentBrand() {
		return paymentBrand;
	}
	public void setPaymentBrand(String paymentBrand) {
		this.paymentBrand = paymentBrand;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getExpiration() {
		return expiration;
	}
	public void setExpiration(String expiration) {
		this.expiration = expiration;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
	public CreditCard(int cardId, int userId, String cardNo, String paymentBrand, String firstName, 
			String lastName, String expiration, String street, String city, int zipCode, String state) {
		this.cardId = cardId;
		this.userId = userId;
		this.cardNo = cardNo;
		this.paymentBrand = paymentBrand;
		this.firstName = firstName;
		this.lastName = lastName;
		this.expiration = expiration;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
	}
	
	@Override
	public String toString () {
		return "CreditCard:[userId = " + userId + ", cardNo = " + cardNo +
				", paymentBrad = " + paymentBrand + ", firstName = " + firstName + ", lastName = " +
				lastName + ", expiration = " + expiration + ", street = " + street + ", city = " +
				city + ", zipCode = " + zipCode + ", state = " + state + "]";
	}
}