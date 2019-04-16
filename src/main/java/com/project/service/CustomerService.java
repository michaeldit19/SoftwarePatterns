package com.project.service;

import com.project.model.Customers;
import com.project.model.Login;

public interface CustomerService {
	
	Customers validateCustomer(Login login);
	
	void register(Customers customers);

}
