package com.microservices.customerservice.proxy;

import org.springframework.stereotype.Component;

import com.microservices.customerservice.model.CustomerServiceModel;

@Component
public class AccountServiceProxyFallbackImpl implements AccountServiceProxy {

	@Override
	public CustomerServiceModel getCustomerAccounts(Integer customerId) {
		CustomerServiceModel response = new CustomerServiceModel(customerId, new int[0], 0, 0);
		return response;
	}

}
