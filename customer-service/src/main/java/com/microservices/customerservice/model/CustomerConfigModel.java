package com.microservices.customerservice.model;

public class CustomerConfigModel {
	
	private int minAccounts;
	private int maxAccounts;
	
	public CustomerConfigModel() {
		
	}
	
	public CustomerConfigModel(int minAccounts, int maxAccounts) {
		super();
		this.minAccounts = minAccounts;
		this.maxAccounts = maxAccounts;
	}

	public int getMinAccounts() {
		return minAccounts;
	}
	public int getMaxAccounts() {
		return maxAccounts;
	}

}
