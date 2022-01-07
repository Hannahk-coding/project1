package com.jw.user.model;

import java.util.Date;

import org.apache.ibatis.type.Alias;

import io.swagger.annotations.ApiModel;
import lombok.Data;
import lombok.NoArgsConstructor;

@ApiModel(value = "사용자 정보 : User", description = "사용자 정보")
@Data
@NoArgsConstructor //기본 생성자
@Alias("user")
public class User {
	private String id;
	private String name;
	private String email;
	private Date createTime;
}
