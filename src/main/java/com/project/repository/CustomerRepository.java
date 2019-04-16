package com.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.project.model.Customers;

public interface CustomerRepository extends CrudRepository<Customers, String> {
	
	

}
