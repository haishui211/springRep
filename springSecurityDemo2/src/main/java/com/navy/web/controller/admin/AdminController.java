package com.navy.web.controller.admin;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin/")
public class AdminController {
	
	@RequestMapping("admin/get/{userId}")
	public Map<String, Object> get(@PathVariable Long userId){
		
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("userId", userId);
		result.put("name", "name" + userId);
		
		return result;
	}
}
