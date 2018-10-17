package com.navy.mapper.sys;

import java.util.List;

import com.navy.mapper.BaseEntity;

public class SysResRole extends BaseEntity{
	
	private static final long serialVersionUID = 6832241326698301310L;
	
	private Long roleId;
	private String resUrl;
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getResUrl() {
		return resUrl;
	}
	public void setResUrl(String resUrl) {
		this.resUrl = resUrl;
	}
	
	private List<String> roles;

	public List<String> getRoles() {
		if(roles != null) {
			return roles;
		}
		
		return roles;
	}
}
