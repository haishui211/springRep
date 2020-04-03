package com.navy.business.testGenerator.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navy.business.testGenerator.model.User;
import com.navy.business.testGenerator.service.UserService;

@RestController
public class TestController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/test")
	public void test(Integer numbers) {
		for(int i = 0; i < numbers; i++) {
			runThread();
		}
	}
	
	private void runThread() {
		Runnable runnable = new Runnable() {
			@Override
			public void run() {
				User user = new User();
				user.setId(1);
				user.setName("zhangsan");
				userService.save(user);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
	}
}
