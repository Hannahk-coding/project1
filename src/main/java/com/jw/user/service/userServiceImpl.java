package com.jw.user.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.http.ResponseEntity;
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
	public List<User> getUserById(String id) throws Exception {
		return mapper.selectById(id);
	}

	@Override
	@Transactional(rollbackOn = Exception.class)
	public User add(User user) throws Exception {
		return mapper.insert(user);
	}

	@Override
	public void edit(User user) throws Exception {
		mapper.update(user);
	}

	@Override
	public void removeUser(String id) throws Exception {
		mapper.delete(id);
	}

}
