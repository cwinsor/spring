/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.plurlsight.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import com.plurlsight.model.Customer;

@Repository("customerRepository")
public class HibernateCustomerRepositoryImpl implements CustomerRepository {

	@Value("${dbUsername}")
	private String dbUsername;
	
	@Override
	public List<Customer> findAll() {

		System.out.println(this.dbUsername);
		
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstname("Chris");
		customer.setLastname("Winsor");
		customers.add(customer);
		return customers;

	}

}
