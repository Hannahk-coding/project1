package com.jw.user.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class userController {
	
	@GetMapping("/home")
	public String view() throws Exception {
		return "index";
	}
	
}
