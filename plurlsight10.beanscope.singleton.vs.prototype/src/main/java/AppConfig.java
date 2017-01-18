import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.plurlsight.repository.CustomerRepository;
import com.plurlsight.repository.HibernateCustomerRepositoryImpl;
import com.plurlsight.service.CustomerService;
import com.plurlsight.service.CustomerServiceImpl;

/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

@Configuration
@ComponentScan({ "com.plurlsight" })
public class AppConfig {

	//@Bean(name = "customerService456")
	public CustomerService getCustomerService() {
		// CustomerServiceImpl service = new
		// CustomerServiceImpl(getCustomerRepository());
		CustomerServiceImpl service = new CustomerServiceImpl();
		// service.setCustomerRepository(getCustomerRepository());
		return service;
	}

	//@Bean(name = "customerRepository789")
	@Bean
	public CustomerRepository getCustomerRepository() {
		return new HibernateCustomerRepositoryImpl();
	}
}
