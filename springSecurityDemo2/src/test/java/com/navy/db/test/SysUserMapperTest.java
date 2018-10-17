package com.navy.db.test;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.navy.mapper.sys.SysUser;
import com.navy.mapper.sys.SysUserMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysUserMapperTest {
	
	@Autowired
	private SysUserMapper sysUserMapper;
	
	@Test
	public void testInsert() {
		SysUser user = new SysUser();
		user.setId(1L);
		user.setUsername("haishui");
		user.setPassword("123456");
		sysUserMapper.insert(user);
	}
	
	@Test
	public void testFind() {
		Long id = 1L;
		SysUser user = sysUserMapper.findByPK(id);
		assertNotNull(user);
	}
}
