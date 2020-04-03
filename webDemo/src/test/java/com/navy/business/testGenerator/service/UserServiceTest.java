package com.navy.business.testGenerator.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.navy.business.testGenerator.model.User;

@SpringBootTest
public class UserServiceTest {
	
	@Autowired
	private UserService userService;
	
	@Test
	public void testSave() {
		User user= new User();
		user.setId(1);
		user.setName("shangsan");
		this.userService.save(user);
	}
	
	@Test
	public void testFind() {
		User user= new User();
		user.setName("shangsan");
		User result = this.userService.findUser(user);
		assertNotNull(result);
	}
}
