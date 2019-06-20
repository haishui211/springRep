package com.navy.db.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.navy.mapper.sys.SysResourceMapper;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SysResourceMapperTest {
	
	@Autowired
	private SysResourceMapper sysResourceMapper;
	
	@Test
	public void testFindRolesByResUrl() {
		String url = "/admin";
		List<String> roles = sysResourceMapper.findRolesByResUrl(url);
		assertNotNull(roles);
	}
}
