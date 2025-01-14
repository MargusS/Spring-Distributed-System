package com.marguss.customer.service;

import com.marguss.customer.api.request.CustomerRegistrationRequest;

public interface  ICustomerService {
	void registerCustomer(CustomerRegistrationRequest customerRegistrationRequest);
}
