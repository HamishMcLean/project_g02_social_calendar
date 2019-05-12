package com.revature.AdventuresTeam.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.AdventuresTeam.models.User;
import com.revature.AdventuresTeam.services.UserService;

//Router
@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@GetMapping()
	public List<User> findAll() {
		return userService.findAll();
	}
	
	@GetMapping("username/{username}")
	public User findByUserName(@PathVariable String username) {
		return userService.findByUserName(username);
	}
	
	@GetMapping("id/{id}")
	public User findById(@PathVariable int id) {
		return userService.findById(id);
	}
	
	@GetMapping("name/{firstname}")
	public User findByFname(@PathVariable String firstname) {
		return userService.findByFname(firstname);
	}
	
	
	@PostMapping()
	public User save (@RequestBody User u) {
		return userService.save(u);
	}

}
