package com.microservices.accountservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.accountservice.entity.CustomerAccount;
import com.microservices.accountservice.model.CustomerAccountsModel;
import com.microservices.accountservice.repo.CustomerAccountRepo;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class AccountController {
	
	@Autowired
	private Environment environment;
	
	@Autowired
	private CustomerAccountRepo customerAccountRepo;
	
	@GetMapping("/accounts/{customerId}")
	@HystrixCommand(fallbackMethod = "getCustomerAccountsFallback")
	public CustomerAccountsModel getCustomerAccounts(@PathVariable Integer customerId) {
//		throw new RuntimeException("Failure excpetion");
		return new CustomerAccountsModel(customerId, customerAccountRepo.findByCustomerId(customerId).stream()
				.mapToInt(CustomerAccount::getAccountNumber).toArray(),
				Integer.parseInt(environment.getProperty("local.server.port")));
	}
	
	public CustomerAccountsModel getCustomerAccountsFallback(@PathVariable Integer customerId) {
		return new CustomerAccountsModel(customerId, new int[0],
				Integer.parseInt(environment.getProperty("local.server.port")));
	}

}
