package com.marguss.customer.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Customer {
	private String id;
	private String firstName;
	private String secondName;
	private String email;
}
