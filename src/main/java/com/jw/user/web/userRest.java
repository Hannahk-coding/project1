package com.jw.user.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@GetMapping
	public ModelAndView getUserList() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<User> list = service.getUserList();
		mav.addObject("list", list);
		mav.setViewName("userList");
		return mav;
	}
	
	@GetMapping("/{id}")
	public User getUserById(@PathVariable String id) {
		return service.getUserById(id);
	}
	
	@PostMapping("")
	public User registerUser(@RequestBody User user) {
		return service.registerUser(user);
	}
	
	@PutMapping("/{id}")
	public void modifyUser(@PathVariable String id, @RequestBody User user) {
		service.modifyUser(id, user);
	}
	
	@DeleteMapping("/{id}")
	public void removeUser(@PathVariable String id) {
		service.removeUser(id);
	}
}
