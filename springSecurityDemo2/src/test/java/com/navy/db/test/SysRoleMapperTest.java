package com.navy.db.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.navy.mapper.sys.SysRole;
import com.navy.mapper.sys.SysRoleMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysRoleMapperTest {
	
	@Autowired
	private SysRoleMapper sysRoleMapper;
	
	@Test
	public void testInsert() {
		SysRole role = new SysRole();
		role.setId(2L);
		role.setName("测试角色");
		role.setCode("TEST_CODE");
		sysRoleMapper.insert(role);
	}
	
	@Test
	public void testFind() {
		Long id = 1L;
		SysRole role = sysRoleMapper.findByPK(id);
		assertNotNull(role);
	}
}
