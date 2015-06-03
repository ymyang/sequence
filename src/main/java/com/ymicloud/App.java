package com.ymicloud;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 * 
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"property/app.xml");

		SequenceLogic seq = context.getBean(SequenceLogic.class);
		seq.getNextId();
	}
}
