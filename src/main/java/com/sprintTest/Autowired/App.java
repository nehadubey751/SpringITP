package com.sprintTest.Autowired;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/sprintTest/Autowired/autoconfig.xml");
		Student s1 =(Student) applicationContext.getBean("Student");
		System.out.println(s1);
		}
		

	}


