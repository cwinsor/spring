import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

import com.plurlsight.repository.CustomerRepository;
import com.plurlsight.repository.HibernateCustomerRepositoryImpl;
import com.plurlsight.service.CustomerService;
import com.plurlsight.service.CustomerServiceImpl;

@Configuration
@ComponentScan({ "com.plurlsight" })
@PropertySource("app.properties")
public class AppConfig {

	@Bean
	public static PropertySourcesPlaceholderConfigurer getPropertySourcesPlaceholderConfigurer() {
		return new PropertySourcesPlaceholderConfigurer();
	}
	
	//@Bean(name = "customerService456")
	//public CustomerService getCustomerService() {
	//	CustomerServiceImpl service = new CustomerServiceImpl(getCustomerRepository());
	//	return service;
	//}

	// bean not necessary because nothing in this config needs standalone access
	// @Bean(name = "customerRepository789")
	//public CustomerRepository getCustomerRepository() {
	//	return new HibernateCustomerRepositoryImpl();
	//}

}
