package com.jw.user.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Alias("user")
public class User {
	
	private int user_seq;																							
	private String id;
	private String name;
	private String email;
	private Date createTime;
}
