package com.navy.mapper.sys;

import com.navy.component.AppGlobalComponent;
import com.navy.mapper.BaseEntity;

public class SysUserRole extends BaseEntity{
	
	private static final long serialVersionUID = 6832241326698301310L;
	
	private Long userId;
	private Long roleId;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	
	private SysRole sysRole;

	public SysRole getSysRole() {
		if(sysRole != null) {
			return sysRole;
		}
		sysRole = AppGlobalComponent.getInstance().sysRoleMapper.findByPK(this.roleId);
		return sysRole;
	}
}
