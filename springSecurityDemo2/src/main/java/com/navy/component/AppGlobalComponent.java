package com.navy.component;


import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.navy.mapper.sys.SysResourceMapper;
import com.navy.mapper.sys.SysRoleMapper;
import com.navy.mapper.sys.SysUserRoleMapper;


/**
 * 全局组件
 * @author lnavy
 */
@Component("appGlobalComponent")
public class AppGlobalComponent implements InitializingBean{
	
	private static AppGlobalComponent instance = null;
	
	@Override
	public void afterPropertiesSet() throws Exception {
		AppGlobalComponent.instance = this;
	}
	
	public static AppGlobalComponent getInstance() {
		return instance;
	}
	
	@Autowired
	public SysRoleMapper sysRoleMapper;
	
	@Autowired
	public SysUserRoleMapper sysUserRoleMapper;
	
	@Autowired
	public SysResourceMapper sysResourceMapper;
}
