package com.jw.user.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.jw.user.model.User;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
	
	private UserMapper mapper;
	
	@Test
	public void testGetUserList() {
		
		try {
			List<User> userList = mapper.getUserList();
			assertNotNull(userList);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
