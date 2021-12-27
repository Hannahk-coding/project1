package com.jw.user.service;

import java.util.List;

import com.jw.user.model.User;

public interface userService {
	
	/** 회원 목록 조회 */
	public List<User> getUserList() throws Exception;
	
	/** 아이디로 유저 조회 */
	public User getUserById(String id);
	
	/** 회원 등록 */
	public User registerUser(User user);

	/** 회원 정보 수정 */
	public void modifyUser(int user_seq, User user);
	
	/** 회원 삭제 */
	public void removeUser(String id);
}
