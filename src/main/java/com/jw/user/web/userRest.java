package com.jw.user.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

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
		User u = User.builder().email("").id("").createTime(null).build();
		return u;
	}
	
	@GetMapping("/test")
	public Map<String, String> jsonTest() {
		Map<String, String> res = new HashMap<>();
		res.put("test", "hi");
		
		return res;
	}
	
//	===================================================================================
	
	@GetMapping("/list")
	public ModelAndView getUserList() throws Exception {
			ModelAndView mav = new ModelAndView();
			List<User> list = service.getUserList();
			mav.addObject("list", list);
			mav.setViewName("user/userList");
		return mav;
	}		
}
