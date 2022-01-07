package com.jw.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.http.ResponseEntity;

import com.jw.user.model.User;

@Mapper
public interface UserMapper {
	
	List<User> selectAll() throws Exception;

	List<User> selectById(String id) throws Exception;

	void insert(User user) throws Exception;

	void update(User user) throws Exception;

	void delete(String id) throws Exception;

}	
	