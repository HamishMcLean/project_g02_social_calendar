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
	
	public User findByUserName(String username) {

		List<User> userList = userRepo.findUsingNameHQL(username);
		if(userList.size() == 0 )
		{
			return null;
		}
		return userList.get(0);
	}
	
	public User findById(int id) {

		List<User> idList = userRepo.findUsingIdHQL(id);
		if(idList.size() == 0 )
		{
			return null;
		}
		return idList.get(0);
	}
	
	public User findByFname(String firstname) {

		List<User> fnList = userRepo.findFnameHQL(firstname);
		if(fnList.size() == 0 )
		{
			return null;
		}
		return fnList.get(0);
	}
	
	
	public User save (User u) {
		return userRepo.save(u);
	}

}
