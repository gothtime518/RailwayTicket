package com.mercury.beans;

public class User {
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String phoneNum;
	private String street;
	private String city;
	private int zipCode;
	private String state;
	private String activation;
	private String securityQuestion;
	private String securityAnswer;
	private boolean enable;
	private UserRole role;
	
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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
	public String getActivation() {
		return activation;
	}
	public void setActivation(String activation) {
		this.activation = activation;
	}
	public String getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(String securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getSecurityAnswer() {
		return securityAnswer;
	}
	public void setSecurityAnswer(String securityAnswer) {
		this.securityAnswer = securityAnswer;
	}
	public boolean isEnable() {
		return enable;
	}
	public void setEnable(boolean enable) {
		this.enable = enable;
	}
	public UserRole getRole() {
		return role;
	}
	public void setRole(UserRole role) {
		this.role = role;
	}
	
	public User(int userId, String firstName, String lastName, String email, String password, 
			String phoneNum, String street, String city, int zipCode, String state, String activation,
			String securityQuestion, String securityAnswer, UserRole role, boolean enable) {
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
		this.phoneNum = phoneNum;
		this.street = street;
		this.city = city;
		this.zipCode = zipCode;
		this.state = state;
		this.activation = activation;
		this.securityQuestion = securityQuestion;
		this.securityAnswer = securityAnswer;
		this.role = role;
		this.enable = enable;
	}
	
	@Override
	public String toString() {
		return "user:[userId" + userId + ", firstName = " + firstName + ", lastName = " + lastName +
				",email = " + email + ",password = " + password + ", phoneNum = " + phoneNum + ",street =" +
				street + ", city = " + city + ", zipCode = " + zipCode + ", state = " + state + 
				", activateion = " + activation + ", securityQuestion = " + securityQuestion + ", sercurityAnswer = " +
				", role = " + role + ", enable = " + enable + "]";			
	}
}
