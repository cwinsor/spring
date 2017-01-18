/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

package com.plurlsight.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.plurlsight.model.Customer;
import com.plurlsight.repository.CustomerRepository;

@Service("customerService123")
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepositoryBlahBlah;

	@Override
	public List<Customer> findAll() {
		return customerRepositoryBlahBlah.findAll();
	}

	/**
	 * @param customerRepositoryBlahBlah
	 *            -
	 */
	@Autowired
	public CustomerServiceImpl(CustomerRepository customerRepositoryBlahBlah) {
		super();
		System.out.println("using constructor injection");
		this.customerRepositoryBlahBlah = customerRepositoryBlahBlah;

	}

}
