package com.navy.core.config.security;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.navy.mapper.sys.SysUser;
import com.navy.mapper.sys.SysUserMapper;

@Component("customerDetailsService")
public class CustomerDetailsService implements UserDetailsService{
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		SysUser sysUser = getUser(username);
		List<String> roles = sysUser.getRoles();
		return new SecurityUser(sysUser, roles);
	}
	
	public SysUser getUser(String username) {
		return sysUserMapper.findByUserName(username);
	}
}
