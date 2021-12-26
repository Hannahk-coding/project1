package com.jw.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jw.user.mapper.UserMapper;
import com.jw.user.model.User;

import lombok.Setter;

@Service
public class userServiceImpl implements userService {
	
	@Setter(onMethod_ = {@Autowired})
	private UserMapper mapper;
	
	@Override
	public List<User> getUserList() throws Exception {
		return mapper.getUserList();
	}

	@Override
	public User getUserById(String id) {
		return mapper.getUserById(id);
	}

	@Override
	public User registerUser(User user) {
		return mapper.registerUser(user);
	}

	@Override
	public void modifyUser(String id, User user) {
		mapper.modifyUser(id, user);
	}

	@Override
	public void removeUser(String id) {
		mapper.removeUser(id);
	}

}
