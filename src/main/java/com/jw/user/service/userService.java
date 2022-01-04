package com.jw.user.service;

import java.util.List;

import com.jw.user.model.User;

public interface userService {
	
	/** 회원 목록 조회 */
	public List<User> getList() throws Exception;
	
	/** 아이디로 유저 조회 */
	public User getUserById(String id) throws Exception;
	
	/** 회원 등록 */
	public User add(User user) throws Exception;

	/** 회원 정보 수정 */
	public void edit(User user) throws Exception;

	/** 회원 삭제 */
	public void removeUser(String id) throws Exception;

}
