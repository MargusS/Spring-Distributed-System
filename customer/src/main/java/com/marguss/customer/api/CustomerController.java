package com.marguss.customer.api;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marguss.customer.api.request.CustomerRegistrationRequest;
import com.marguss.customer.service.CustomerService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {

	private CustomerService customerService;

	@PostMapping
	public void registerCustomer(@RequestBody CustomerRegistrationRequest customerRegistrationRequest) {
		log.info("New Costumer Registration {}", customerRegistrationRequest);
	}

}
