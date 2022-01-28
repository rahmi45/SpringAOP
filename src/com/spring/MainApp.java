package com.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.configuration.SpringContainer;
import com.spring.dao.PostDao;
import com.spring.dao.PostService;
//import com.spring.dao.Student;
import com.spring.model.User;

public class MainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext  ann =
				new AnnotationConfigApplicationContext(SpringContainer.class);
		
//		Student st = ann.getBean("student", Student.class);
//		st.myData();
		
		PostDao po = ann.getBean("postDaoImpl", PostDao.class);
		User u = new User();
		po.allPosts(u);
		int re =0;
		System.out.println(po.allLikes(u, re));
		po.findDao();
		System.out.println("****************************************");
		po.setId();
		po.getId();
		System.out.println("****************************************");
		
		System.out.println("/////////////////////////////////////////");
		
		PostService ps = ann.getBean("postServiceImpl", PostService.class);
		System.out.println(ps.allPosts(u, re));
		System.out.println(ps.allLikes(u));
		ps.startService();
		System.out.println("****************************************");
		ps.setName();
		ps.getName();
		System.out.println("****************************************");
		
		ann.close();

	}

}
