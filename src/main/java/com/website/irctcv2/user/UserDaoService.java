package com.website.irctcv2.user;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
	
	static List<User> users = new ArrayList<User>();
	
	static {
		users.add(new User(1, "Alex", new Date(), 'M', "temp@temp.com"));
		users.add(new User(2, "Sam", new Date(), 'M',"temp2@temp.com"));
		users.add(new User(3, "Rose", new Date(), 'F',"temp3@temp.com"));
	}
	
	List<User> findAllUsers(){
		return users;
	}
	
	User findUserById(int id) {
		for(User user: users) {
			if(user.getId() == id) {
				return user;
			}
		}
		return null;
	}
	
	User findUserByEmail(String email) {
		for(User user: users) {
			if(user.getEmail().equals(email)) {
				return user;
			}
		}
		return null;
	}
	
}
