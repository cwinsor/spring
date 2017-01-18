import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.plurlsight.service.CustomerService;

/*
 * Copyright (c) 2017 General Electric Company. All rights reserved.
 *
 * The copyright to the computer software herein is the property of
 * General Electric Company. The software may be used and/or copied only
 * with the written permission of General Electric Company or in accordance
 * with the terms and conditions stipulated in the agreement/contract
 * under which the software has been supplied.
 */

/**
 * 
 * @author predix -
 */
public class Application {

	/**
	 * @param args
	 *            -
	 */
	public static void main(String[] args) {

	ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
	CustomerService service = appContext.getBean("customerService122",CustomerService.class);

	System.out.println(service.findAll().get(0).getFirstname());
	}

}
