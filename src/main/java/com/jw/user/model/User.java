package com.jw.user.model;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Data
@Builder
public class User {
	
	private String id;
	private String name;
	private String email;
	private Date createTime;
	
}
