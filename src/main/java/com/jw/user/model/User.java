package com.jw.user.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class User {
	
	private String id;
	private String name;
	private String email;
	private Date createTime;
}
