package com.mercury.beans;

public class UserRole {
	private int userRoleId;
	private String authority;
	
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public String getAuthority() {
		return authority;
	}
	public void setAuthority(String authority) {
		this.authority = authority;
	}
	
	public UserRole(int userRoleId, String authority) {
		this.userRoleId = userRoleId;
		this.authority = authority;
	}
	
	@Override
	public String toString() {
		return "UserRole:[ userRoleId = " + userRoleId + ", authority = " + authority + "]";
	}

}
