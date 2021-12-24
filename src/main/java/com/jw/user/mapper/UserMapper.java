package com.jw.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.jw.user.model.User;

@Mapper
public interface UserMapper {
	
	public List<User> getUserList() throws Exception;
}	
	