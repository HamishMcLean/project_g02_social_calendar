package com.revature.AdventuresTeam.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.AdventuresTeam.models.Event;
import com.revature.AdventuresTeam.repository.EventRepo;



@Service
public class EventService {
	
	@Autowired
	private EventRepo eventRepo;
	
	public List<Event> findAll() {
		return eventRepo.findAll();
	}
	
	public Event findByEventId(int eventid) {
		List<Event> eventIdList = eventRepo.findEventIdHQL(eventid);
		if(eventIdList.size() == 0)
		{
			return null;
		}
		return eventIdList.get(0);
	}
	
	public Event save(Event e) {
		return eventRepo.save(e);
	}
	
}
