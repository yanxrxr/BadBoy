package com.badboy.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.badboy.service.UserService;

public class ConsumerTest {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("consumer user start");
		UserService userService = context.getBean(UserService.class);
		System.out.println("consumer user");
		System.out.println(userService.getName("1"));
	}

}
