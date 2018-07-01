package com.badboy.service.impl;

import org.springframework.stereotype.Service;

import com.badboy.service.UserService;


@Service ("userService")
public class UserServiceImpl implements UserService{

	@Override
	public String getName(String name) {
		System.out.println("Name: " + name);
		return name;
	}

}
