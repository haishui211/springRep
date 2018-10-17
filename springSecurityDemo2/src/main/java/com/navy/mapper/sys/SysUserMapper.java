package com.navy.mapper.sys;

import com.navy.mapper.BaseMapper;

public interface SysUserMapper extends BaseMapper<SysUser, Long>{
	public SysUser findByUserName(String username);
}
