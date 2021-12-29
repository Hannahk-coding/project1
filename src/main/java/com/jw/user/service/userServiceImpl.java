package com.jw.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.jw.user.mapper.UserMapper;
import com.jw.user.model.User;

@Service
public class userServiceImpl implements userService {
	
	private final UserMapper mapper;
	
	public userServiceImpl(final UserMapper mapper) {
		this.mapper = mapper;
	}
	
	@Override
	public List<User> getList() throws Exception {
		return mapper.selectAll();
	}

	@Override
	public User getUserById(String id) throws Exception {
		return mapper.selectById(id);
	}

	@Override
	public User addUser(User user) throws Exception {
		return mapper.insert(user);
	}

	@Override
	public void editUser(User user) throws Exception {
		mapper.update(user);
	}

	@Override
	public void removeUser(String id) throws Exception {
		mapper.delete(id);
	}

}
