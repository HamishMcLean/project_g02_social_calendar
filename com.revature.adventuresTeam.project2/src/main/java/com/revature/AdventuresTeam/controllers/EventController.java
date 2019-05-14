package com.revature.AdventuresTeam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.AdventuresTeam.models.Event;
import com.revature.AdventuresTeam.services.EventService;


@RestController
@RequestMapping("event")
public class EventController {
	@Autowired
	private EventService eventService;
	
	@GetMapping("eventid/{eventid}")
	public Event findByEventId(@PathVariable int eventid) {
		return eventService.findByEventId(eventid);
	}
	
	@PostMapping()
	public Event save (@RequestBody Event e) {
		return eventService.save(e);
	}

}
