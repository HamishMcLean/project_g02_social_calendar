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
	
	@GetMapping("name/{name}")
	public User findByName(@PathVariable String name) {
		return userService.findByName(name);
	}
	
	@PostMapping()
	public User save (@RequestBody User u) {
		return userService.save(u);
	}

}
