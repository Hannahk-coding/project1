package com.jw.user.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.ibatis.type.Alias;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value = "사용자 정보 : User", description = "사용자 정보")
@XmlRootElement(name = "user")
@XmlType(propOrder = {"id", "name", "email", "createTime"})
@Data
@Alias("user")
public class User {
	
	public User() {
	}
	
	@ApiModelProperty(value = "사용자 아이디")
	private String id;
	@ApiModelProperty(value = "사용자 이름")
	private String name;
	@ApiModelProperty(value = "사용자 이메일")
	private String email;
	@ApiModelProperty(value = "사용자 등록일자")
	private Date createTime;
}
