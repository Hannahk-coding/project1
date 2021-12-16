package com.jw.user.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jw.user.service.userService;

@RestController
@RequestMapping({"/user","/user/v1"})
public class userRest {
	
//	@Autowired
//	private userService userservice;
	
	private final userService service;
	public userRest(final userService service) {
		this.service = service;
	}
	
	
	
}
