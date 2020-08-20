package com.microservices.customerservice.proxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.customerservice.model.CustomerServiceModel;


@FeignClient(name="account-service", url="localhost:8000")
//@FeignClient(name="account-service", fallback = AccountServiceProxyFallbackImpl.class)
//@FeignClient(name="account-service")
//@RibbonClient(name="account-service")
public interface AccountServiceProxy {
	
	@GetMapping("/accounts/{customerId}")
	public CustomerServiceModel getCustomerAccounts(@PathVariable Integer customerId);

}
