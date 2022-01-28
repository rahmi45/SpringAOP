package com.spring.dao;

import org.springframework.stereotype.Component;

import com.spring.model.User;

@Component
public class PostDaoImpl implements PostDao{

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

}
