package com.jw.user.web;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jw.user.model.User;
import com.jw.user.service.userService;

import io.swagger.annotations.ApiOperation;

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
	
	@ApiOperation(value = "사용자 목록 조회", notes = "사용자 목록을 조회합니다.")
	@GetMapping
	public ModelAndView getUserList() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<User> list = service.getList();
		mav.addObject("list", list);
		mav.setViewName("userList");
		return mav;
	}
	
}
