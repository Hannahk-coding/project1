package com.jw.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jw.user.model.User;

@Mapper
public interface UserMapper {
	
	public List<User> getUserList() throws Exception;

	public User getUserById(String id);

	public User registerUser(User user);

	public void modifyUser(String id, User user);

	public void removeUser(String id);
}	
	