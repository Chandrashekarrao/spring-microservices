package com.microservices.accountservice.model;

public class CustomerAccountsModel {
	
	private int customerId;
	private int[] customerAccounts;
	private int port;
	
	public CustomerAccountsModel(int customerId, int[] customerAccounts, int port) {
		super();
		this.customerId = customerId;
		this.customerAccounts = customerAccounts;
		this.port = port;
	}
	
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public int[] getCustomerAccounts() {
		return customerAccounts;
	}
	public void setCustomerAccounts(int[] customerAccounts) {
		this.customerAccounts = customerAccounts;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}

}
