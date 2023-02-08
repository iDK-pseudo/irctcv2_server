package com.website.irctcv2.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserDaoService service;
	
	@GetMapping("/users")
	List<User> retrieveAllUsers(){
		return service.findAllUsers();
	}
	
	@GetMapping(path = "/users", params = "id")
	User retrieveUserbyId(@RequestParam int id){
		return service.findUserById(id);
	}
	
	@GetMapping(path = "/users", params="email")
	User retrieveUserByEmailId(@RequestParam String email) {
		return service.findUserByEmail(email);
	}
}
