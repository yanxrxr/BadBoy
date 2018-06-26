package com.badboy.test;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ServiceTest {

	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-provider.xml");
		System.out.println(context.getDisplayName() + ":here");
		context.start();
		System.out.println("provider start");
		System.in.read();
	}

}
