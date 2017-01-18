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

	/**
	 * -
	 */
	public CustomerServiceImpl(CustomerRepository customerRepository) {
		this.customerRepositoryBlahBlah = customerRepository;
	}

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
	 *            to set the primary customerRepository
	 */
	public void setCustomerRepositoryPrimary(CustomerRepository customerRepository) {
		this.customerRepositoryBlahBlah = customerRepository;
	}

	public void setCustomerRepositorySecondary(CustomerRepository customerRepository) {
		this.customerRepositoryBlahBlah = customerRepository;
	}

}
