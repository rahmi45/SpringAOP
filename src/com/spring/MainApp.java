package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.Student;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ann =
				new AnnotationConfigApplicationContext(SpringContainer.class);
		
		Student st = ann.getBean("student", Student.class);
		st.myData();

	}

}
