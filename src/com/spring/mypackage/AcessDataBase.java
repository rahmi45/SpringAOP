package com.spring.mypackage;

import org.springframework.stereotype.Component;

@Component
public class AcessDataBase {
	
	public void getStudent() {
		System.out.println("Student..........");
		throw new RuntimeException("STOOOOP");
	}
}
