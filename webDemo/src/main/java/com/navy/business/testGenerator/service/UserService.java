package com.navy.business.testGenerator.service;

import com.navy.business.testGenerator.model.User;

public interface UserService {
	void save(User user);
	
	User findUser(User user);
}
