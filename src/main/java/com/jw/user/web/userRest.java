package com.jw.user.web;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.jw.user.model.User;
import com.jw.user.service.userService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;

@Api(tags = "사용자 관련한 API : /user")
@RestController
@RequestMapping({"/user","/user/v1"})
public class userRest {
	
	private final userService service;
	
	public userRest(final userService service) {
		this.service = service;
	}
	
	@ApiOperation(value = "사용자 목록 조회", notes = "사용자 목록을 조회합니다.")
	@GetMapping
	public ModelAndView getUserList() throws Exception {
		ModelAndView mav = new ModelAndView();
		List<User> list = service.getUserList();
		mav.addObject("list", list);
		mav.setViewName("userList");
		return mav;
	}
	
	@ApiOperation(value = "사용자 아이디로 조회", notes = "사용자 목록을 아이디로 조회합니다.")
	@GetMapping("/find/{id}")
	public User getUserById(@PathVariable String id) {
		return service.getUserById(id);
	}
	
	@ApiOperation(value = "사용자 등록", notes = "사용자를 등록합니다.")
	@PostMapping("")
	public User registerUser(@RequestBody User user) {
		return service.registerUser(user);
	}
	
	@ApiOperation(value = "사용자 수정", notes = "사용자 정보를 수정합니다.")
	@PutMapping("/modify/{id}")
	public void modifyUser(@RequestBody User user) {
		service.modifyUser(user);
	}
	
	@ApiOperation(value = "사용자 삭제", notes = "사용자를 삭제합니다.")
	@DeleteMapping("/delete/{id}")
	public void removeUser(@PathVariable String id) {
		service.removeUser(id);
	}
}
