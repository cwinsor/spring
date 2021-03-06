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

import org.springframework.stereotype.Repository;

import com.plurlsight.model.Customer;

/**
 * 
 * @author predix -
 */
//@Repository("dddddddd")
public class HibernateCustomerRepositoryImpl2 implements CustomerRepository {

	/* (non-Javadoc)
	 * @see com.plurlsight.repository.CustomerRepository#findAll()
	 */
	@Override
	public List<Customer> findAll() {
		List<Customer> customers = new ArrayList<>();

		Customer customer = new Customer();
		customer.setFirstname("Jack");
		customer.setLastname("Avery");
		customers.add(customer);
		return customers;

	}

}
