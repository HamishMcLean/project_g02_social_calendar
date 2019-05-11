package com.revature.AdventuresTeam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.AdventuresTeam.models.User;
import com.revature.AdventuresTeam.repository.UserRepo;

//Services`
@Service
public class UserService {
	
	@Autowired
	private UserRepo userRepo;
	
	public List<User> findAll() {
		return userRepo.findAll();
	}
	
	public User findByName(String name) {

		List<User> userList = userRepo.findUsingNameHQL(name);
		if(userList.size() == 0 )
		{
			return null;
		}
		return userList.get(0);
	}
	
	public User save (User u) {
		return userRepo.save(u);
	}

}
