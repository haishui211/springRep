package com.navy.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navy.component.SocketClientComponent;

@RestController
@RequestMapping("/test")
public class TestController {
	
	@Autowired
	private SocketClientComponent socketClientComponent;
	
	@PostMapping("/push")
	public void push(@RequestBody Map<String, Object> data) {
		String eventName = (String) data.get("eventName");
		String userId = (String) data.get("userId");
		String pageSign = (String) data.get("pageSign");
		socketClientComponent.send(userId, pageSign, eventName, data);
	}
}
