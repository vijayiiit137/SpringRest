package com.vijay.cart.model;

public class Acoount {

	private int accountId;
	private String name;
	private String userName;
	private String password;

	public Acoount(int accountId, String name, String userName, String password) {

		this.accountId = accountId;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public int getAccountId() {
		return accountId;
	}

	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
