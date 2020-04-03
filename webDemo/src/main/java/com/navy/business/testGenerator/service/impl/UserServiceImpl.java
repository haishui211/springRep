package com.navy.business.testGenerator.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navy.business.testGenerator.dao.UserMapper;
import com.navy.business.testGenerator.model.User;
import com.navy.business.testGenerator.model.UserExample;
import com.navy.business.testGenerator.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Override
	public void save(User user) {
		this.userMapper.insertSelective(user);
	}

	@Override
	public User findUser(User user) {
		UserExample example = new UserExample();
		example.createCriteria().andNameEqualTo(user.getName());
		List<User> list = this.userMapper.selectByExample(example);
		if(list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}
	
	

}
