package com.spring.dao;

import org.springframework.stereotype.Component;

@Component
public class PostServiceImpl implements PostService{

	@Override
	public String allPosts() {
//		System.out.println("My Posts..........PostService");
		return "My Posts..........PostService";
		
	}

}
