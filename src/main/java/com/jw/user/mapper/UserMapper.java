package com.jw.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jw.user.model.User;

@Mapper
public interface UserMapper {
	
	List<User> selectAll();

	User selectById(String id);

	User insert(User user);

	void update(User user);

	void delete(String id);
}	
	