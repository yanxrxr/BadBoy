package com.badboy.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerTest {
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		context.start();
		System.out.println("consumer user start");
		/*UserService userService = context.getBean(UserService.class);
		System.out.println("consumer user");
		System.out.println(userService.getName("1"));*/
		System.in.read();
		context.close();
		
	}

}
