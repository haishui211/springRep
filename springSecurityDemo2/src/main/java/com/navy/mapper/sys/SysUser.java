package com.navy.mapper.sys;

import java.util.List;

import com.navy.component.AppGlobalComponent;
import com.navy.mapper.BaseEntity;

public class SysUser extends BaseEntity{
	
	private static final long serialVersionUID = 1690584915542385955L;
	
	private Long id;
	private String username;
	private String password;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	private List<String> roles;

	public List<String> getRoles() {
		if(roles != null) {
			return roles;
		}
		
		List<String> roles = AppGlobalComponent.getInstance().sysUserRoleMapper.findRolesByUserId(this.id);
		
		return roles;
	}
}
