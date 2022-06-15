package com.pluralsight.springaop.example5;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PassengersManager {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
			    new ClassPathXmlApplicationContext("example5/aop.xml");
		
		PassengerDao passengerDao = (PassengerDao)context.getBean("passengerDao");
//		System.out.println(passengerDao.getPassenger(0));

		try {
			System.out.println(passengerDao.getPassenger(0));
		} catch(RuntimeException e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Exception should be processed");
		context.close();
	}

}
