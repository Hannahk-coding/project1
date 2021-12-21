package com.jw.user.mapper;

import java.util.List;
import com.jw.user.model.User;

public interface UserMapper {
	
	/** 회원 목록 조회 */
	public List<User> getUserList() throws Exception;

}
