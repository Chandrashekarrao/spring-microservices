package com.microservices.customerservice.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("customer-service")
public class CustomerConfiguration {
	
	private int minAccounts;
	private int maxAccounts;

	public int getMinAccounts() {
		return minAccounts;
	}
	public int getMaxAccounts() {
		return maxAccounts;
	}
	public void setMinAccounts(int minAccounts) {
		this.minAccounts = minAccounts;
	}
	public void setMaxAccounts(int maxAccounts) {
		this.maxAccounts = maxAccounts;
	}

}
