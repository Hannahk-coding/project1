package com.jw.user.web;

import java.util.List;

import org.apache.maven.model.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jw.user.model.User;
import com.jw.user.service.userService;

@Controller
public class userController {
	
	private final userService service;
	
	public userController(final userService service) {
		this.service = service;
	}
	
	@GetMapping("/home")
	public String view() throws Exception {
		return "index";
	}
	
	@GetMapping("/list")
	public ModelAndView getUserList() throws Exception {
		ModelAndView mv = new ModelAndView("/user/userList");
		List<User> list = service.getList();
		mv.addObject("list", list);
		return mv;
	}
}
