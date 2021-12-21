package com.jw.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jw.user.mapper.UserMapper;
import com.jw.user.model.User;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class userService {
	
	private UserMapper userMapper;
	
	/** 회원 목록 조회 */
	public List<User> getUserList() throws Exception {
		return userMapper.getUserList();
	}
	
	
	
}
