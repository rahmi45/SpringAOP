package com.spring.mypackage;

import org.springframework.stereotype.Component;

@Component("myPerson")
public class Person {
	
	
	public void getData() {
		System.out.println("I am Person...");
		
	}

}
