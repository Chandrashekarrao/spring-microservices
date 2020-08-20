package com.microservices.accountservice.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.accountservice.entity.CustomerAccount;

public interface CustomerAccountRepo extends JpaRepository<CustomerAccount, Long>{
	List<CustomerAccount> findByCustomerId(Integer customerId);
}
