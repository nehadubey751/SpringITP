package com.springTest.ConsInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		System.out.println("inside the constructor injection....");
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("com/springTest/ConsInjection/config.xml");

			car car1=(car) applicationContext.getBean("audi_car");
			System.out.println("car1");
			car car2=(car) applicationContext.getBean("BMW_car");
			System.out.println("car2");
	}

}
