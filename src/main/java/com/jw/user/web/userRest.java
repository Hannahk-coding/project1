package com.jw.user.web;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jw.user.model.User;
import com.jw.user.service.userService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(tags = "사용자 관련한 API : /user")
@RestController
@CrossOrigin
@RequestMapping({"/user","/user/v1"})
public class userRest {
	
	private final userService service;
	
	public userRest(final userService service) {
		this.service = service;
	}
	
	@ApiOperation(value = "사용자 전체 조회", notes = "사용자 목록을 아이디로 조회합니다.")
	@GetMapping
	public List<User> getUser() throws Exception {
		return service.getList();
	}
		
	@ApiOperation(value = "사용자 아이디로 조회", notes = "사용자 목록을 아이디로 조회합니다.")
	@GetMapping("{id}")
	public List<User> getUserById(@PathVariable("id") String id) throws Exception {
		return service.getUserById(id);
	}
	
	@ApiOperation(value = "사용자 등록", notes = "사용자를 등록합니다.")
	@PostMapping
	public User addUser(@RequestBody User user) throws Exception {
		return service.add(user);
	}
	
	@ApiOperation(value = "사용자 수정", notes = "사용자 정보를 수정합니다.")
	@PutMapping("{id}")
	public void editUser(@RequestBody User user) throws Exception {
		service.edit(user);
	}
	
	@ApiOperation(value = "사용자 삭제", notes = "사용자를 삭제합니다.")
	@DeleteMapping("{id}")
	public void removeUser(@PathVariable("id") String id) throws Exception {
		service.removeUser(id);
	}
}
