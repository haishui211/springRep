package com.navy.mapper.sys;

import java.util.List;

import com.navy.mapper.BaseMapper;

public interface SysUserRoleMapper extends BaseMapper<SysUserRole, Long>{
	public List<String> findRolesByUserId(Long userId);
}
