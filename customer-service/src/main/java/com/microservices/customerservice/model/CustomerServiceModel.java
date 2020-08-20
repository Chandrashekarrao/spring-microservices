package com.microservices.customerservice.model;

import java.util.List;


public class CustomerServiceModel {
	
	private int customerId;
	private int[] customerAccounts;
	private int port;
	private int totalAccounts;
	
	public CustomerServiceModel(int customerId, int[] customerAccounts, int port, int totalAccounts) {
		super();
		this.customerId = customerId;
		this.customerAccounts = customerAccounts;
		this.port = port;
		this.totalAccounts = totalAccounts;
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

	public int getTotalAccounts() {
		return totalAccounts;
	}

	public void setTotalAccounts(int totalAccounts) {
		this.totalAccounts = totalAccounts;
	}

}
