package com.jw.user.web;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jw.user.model.User;
import com.jw.user.service.userService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping({"/user","/user/v1"})
public class userRest {
	
	private final userService service;
	public userRest(final userService service) {
		this.service = service;
	}
	
	@GetMapping
	public Object user() throws Exception{
		log.debug("/user start");
		
		User user = new User();
		user.setId("proj");
		user.setName("김지우");
		user.setEmail("abcd@gmail.com");
		user.setCreate_time(String.valueOf(new Date()));
		
		return user;
	}
	
	
}
