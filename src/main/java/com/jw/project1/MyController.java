package com.jw.project1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/test","/test/v1"})
public class MyController {
	
	@GetMapping
	public @ResponseBody String view() throws Exception{
		return "Hello";
	}
}
