package com.alain.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.alain.course.entities.User;
import com.alain.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Julia Pio Nascimento", "jujuba@gmail.com", "55 31 992990407", "654321");
		User u2 = new User(null, "Alain Vaz Nascimento", "alainvaz@gmail.com", "55 31 992990403", "123456");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	

}
