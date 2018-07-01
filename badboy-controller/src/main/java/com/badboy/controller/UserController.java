package com.badboy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.badboy.service.UserService;

@Controller("userController")
@RequestMapping("user")
public class UserController {
	@Autowired
	UserService userService;
	
	@ResponseBody
	@RequestMapping("getName")
	public String getName(String name) {
		System.out.println("Got user name: " + name);
		userService.getName(name);
		return name;
	}

}
