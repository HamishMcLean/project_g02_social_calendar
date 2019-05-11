package com.revature.AdventuresTeam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.AdventuresTeam.models.User;

//DAO
public interface UserRepo extends JpaRepository<User, Integer> {

//	the following is wrong and will cause a failed build
//	List<User> findByNametest(String nametest);
	// this is the right version
	
	//The follwoing is Autoprovision
	//List<User> findByName(String name);
	// an alternate version using hql
	@Query("FROM User user WHERE user.name = :name")
	List<User> findUsingNameHQL(String name);

}
