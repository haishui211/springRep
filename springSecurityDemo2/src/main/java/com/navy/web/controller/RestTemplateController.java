package com.navy.web.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class RestTemplateController {
	
	private RestTemplate restTemplate = new RestTemplate();
	
	@SuppressWarnings("unchecked")
	@RequestMapping("rest-template/get/{userId}")
	public Map<String, Object> get(@PathVariable Long userId){
		String url = "http://localhost:8080/user/get/" + userId;
		return restTemplate.getForEntity(url, Map.class).getBody();
	}
}
