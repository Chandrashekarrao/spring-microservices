package com.microservices.accountservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer_account")
public class CustomerAccount {
	
	private Integer customerId;
	
	@Id
	private Integer accountNumber;
	
	public CustomerAccount() {
		
	}
	
	public CustomerAccount(Integer customerId, Integer accountNumber) {
		super();
		this.customerId = customerId;
		this.accountNumber = accountNumber;
	}
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public Integer getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(Integer accountNumber) {
		this.accountNumber = accountNumber;
	}

}
