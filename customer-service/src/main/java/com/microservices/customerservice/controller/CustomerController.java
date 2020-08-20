package com.microservices.customerservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.customerservice.config.CustomerConfiguration;
import com.microservices.customerservice.model.CustomerConfigModel;
import com.microservices.customerservice.model.CustomerServiceModel;
import com.microservices.customerservice.proxy.AccountServiceProxy;

@RestController
public class CustomerController {

	@Autowired
	private CustomerConfiguration configuration;
	
	@Autowired
	private AccountServiceProxy proxy;

	@GetMapping("/customer-config")
	public CustomerConfigModel getCustomerConfig() {
		return new CustomerConfigModel(configuration.getMinAccounts(), configuration.getMaxAccounts());
	}
	
	@GetMapping("/customer-accounts/{customerId}")
	public CustomerServiceModel retrieveCustomerAccounts(@PathVariable Integer customerId) {
		
		CustomerServiceModel response = proxy.getCustomerAccounts(customerId);
		response.setTotalAccounts(response.getCustomerAccounts().length);
		return response;
	}

}
