package com.jw.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jw.user.model.User;

@Mapper
public interface UserMapper {
	
	List<User> getUserList() throws Exception;

	User getUserById(String id);

	User registerUser(User user);

	void modifyUser(User user);

	void removeUser(String id);
}	
	