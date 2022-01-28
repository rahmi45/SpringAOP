package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.mypackage.AcessDataBase;
//import com.spring.mypackage.Person;

public class MainAOP {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ann =
				new AnnotationConfigApplicationContext(SpringContainer.class);
		
//		Person person = ann.getBean("myPerson", Person.class);
//		
//		person.getData();
		
		AcessDataBase ac = ann.getBean("acessDataBase", AcessDataBase.class); 
		System.out.println(ac.getStudent());
		
		
		ann.close();

	}

}
