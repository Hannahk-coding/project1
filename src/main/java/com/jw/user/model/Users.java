package com.jw.user.model;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(value="사용자 목록 : Users", description = "사용자 목록")
@XmlRootElement(name = "users")
@Data
public class Users {
	
	public Users() {}
	
	@ApiModelProperty(value = "사용자 목록")
	private List<User> users;
	
	@XmlElement
	public List<User> getUsers() {
		return users;
	}
	
}
