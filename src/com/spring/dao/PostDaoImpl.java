package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostDaoImpl implements PostDao{
	
	private int id;

	@Override
	public void allPosts(User user) {
		System.out.println("My posts ......PostDao!");
		
	}

	@Override
	public String allLikes(User user, int result) {
		return "PostDoa......Likes";
		
	}

	@Override
	public void findDao() {
		System.out.println("Find Dao.....");
		
	}

	@Override
	public void setId() {
		System.out.println("this is set ID");
		
	}

	@Override
	public int getId() {
		System.out.println("this is get ID");
		return 0;
	}

}
