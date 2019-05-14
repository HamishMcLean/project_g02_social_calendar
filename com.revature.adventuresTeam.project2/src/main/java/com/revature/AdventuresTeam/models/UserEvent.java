package com.revature.AdventuresTeam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class UserEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int usereventid;
	
	@ManyToOne// ask blake specifics on how the relation works
	private String usernameid;
	
	@ManyToOne
	private int eventid;
	
	
}
