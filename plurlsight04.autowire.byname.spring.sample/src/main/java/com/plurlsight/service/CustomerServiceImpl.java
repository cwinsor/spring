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

import com.plurlsight.model.Customer;
import com.plurlsight.repository.CustomerRepository;

/**
 * 
 * @author predix -
 */
public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepositoryBlahBlah;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.plurlsight.service.CustomerService#finaAll()
	 */
	@Override
	public List<Customer> findAll() {
		return customerRepositoryBlahBlah.findAll();

	}

	/**
	 * @param customerRepository
	 *            set the customerRepository
	 */
	// there is a "blaaaaa" in our applicationContext.xml - so it will get
	// auto-wired
	public void setBlaaaaah(CustomerRepository yuck) {
		this.customerRepositoryBlahBlah = yuck;
	}

	// there is a "blaaaaa2" object in our applicationContext.xml - so it will
	// get auto-wired
	public void setBlaaaaah2(CustomerRepository yuck) {
		this.customerRepositoryBlahBlah = yuck;
	}

	// there is no "blaaaaa3" in our applicationContext.xml - so this won't get
	// auto-wired, but not an error
	public void setBlaaaaah3(CustomerRepository yuck) {
		this.customerRepositoryBlahBlah = yuck;
	}

}
