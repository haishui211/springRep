package com.navy.core.config.security;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("customerDetailsService")
public class CustomerDetailsService implements UserDetailsService{
	
	//在这里将用户服务引入进来
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser sysUser = getUser(username);
		List<String> roles = getRoles(sysUser);
		return new SecurityUser(sysUser, roles);
	}
	
	public SysUser getUser(String username) {
		
		SysUser sysUser = new SysUser();
		
		sysUser.setUsername(username);
		sysUser.setId(1L);
		sysUser.setPassword("123456");
		
		return sysUser;
	}
	
	public List<String> getRoles(SysUser sysUser){
		List<String> roles = new ArrayList<String>();
		roles.add("user-role");
		
		return roles;
	}
}
