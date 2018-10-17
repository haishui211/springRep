package com.navy.mapper.sys;

import java.util.List;

import com.navy.mapper.BaseMapper;

public interface SysResourceMapper extends BaseMapper<SysResource, Long>{
	public List<String> findRolesByResUrl(String resUrl);
}
