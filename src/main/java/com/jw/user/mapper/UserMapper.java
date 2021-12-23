package com.jw.user.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.jw.user.model.User;

@Mapper
public interface UserMapper {
	
	/** 회원 목록 조회 */
	public List<User> getUserList() throws Exception;

}
