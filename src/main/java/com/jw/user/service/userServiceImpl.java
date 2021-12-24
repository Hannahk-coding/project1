package com.jw.user.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jw.user.mapper.UserMapper;
import com.jw.user.model.User;


@Service
@Transactional(readOnly = true)
public class userServiceImpl implements userService {
	
	private UserMapper mapper;
	
	@Override
	public List<User> getUserList() throws Exception {
		return mapper.getUserList();
	}

}
