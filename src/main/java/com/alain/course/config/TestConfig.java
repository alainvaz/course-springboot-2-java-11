package com.alain.course.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alain.course.entities.Category;
import com.alain.course.entities.Order;
import com.alain.course.entities.User;
import com.alain.course.entities.enums.OrderStatus;
import com.alain.course.repositories.CategoryRepository;
import com.alain.course.repositories.OrderRepository;
import com.alain.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public void run(String... args) throws Exception {
		
		Category cat1 = new Category(null, "Electronics");
		Category cat2 = new Category(null, "Books");
		Category cat3 = new Category(null, "Computers");
		
		categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
		
		User u1 = new User(null, "Julia Pio Nascimento", "jujuba@gmail.com", "55 31 992990407", "654321");
		User u2 = new User(null, "Alain Vaz Nascimento", "alainvaz@gmail.com", "55 31 992990403", "123456");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T01:53:07z"),OrderStatus.WAITING_PAYMENT, u1);
		Order o2 = new Order(null, Instant.parse("2020-06-20T19:53:07z"),OrderStatus.CANCELED, u2);
		Order o3 = new Order(null, Instant.parse("2021-06-20T19:53:07z"),OrderStatus.SHIPPED, u1) ;
	
		userRepository.saveAll(Arrays.asList(u1, u2));
		
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
	}

	
	

}
