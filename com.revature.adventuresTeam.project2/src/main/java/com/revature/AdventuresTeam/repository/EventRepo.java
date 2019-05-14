package com.revature.AdventuresTeam.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.revature.AdventuresTeam.models.Event;

public interface EventRepo extends JpaRepository<Event, Integer>{
	@Query("FROM Event event WHERE event.eventid = :eventid")
	List<Event> findEventIdHQL (int eventid);
	
}
