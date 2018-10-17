package com.navy.mapper.sys;

import java.util.List;

import com.navy.component.AppGlobalComponent;
import com.navy.mapper.BaseEntity;

public class SysResource extends BaseEntity{
	
	private static final long serialVersionUID = 6832241326698301310L;
	
	private String name;
	private String resUrl;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		roles = AppGlobalComponent.getInstance().sysResourceMapper.findRolesByResUrl(this.resUrl);
		return roles;
	}
}
