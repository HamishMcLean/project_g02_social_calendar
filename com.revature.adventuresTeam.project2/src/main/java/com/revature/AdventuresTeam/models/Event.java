package com.revature.AdventuresTeam.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Event {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int eventid;
	private String timestart;
	private String timeend;
	private String date;
	private String eventlocation ;
	private String description;
	public Event() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Event(int eventid, String timestart, String timeend, String date, String eventlocation, String description) {
		super();
		this.eventid = eventid;
		this.timestart = timestart;
		this.timeend = timeend;
		this.date = date;
		this.eventlocation = eventlocation;
		this.description = description;
	}
	@Override
	public String toString() {
		return "Event [eventid=" + eventid + ", timestart=" + timestart + ", timeend=" + timeend + ", date=" + date
				+ ", eventlocation=" + eventlocation + ", description=" + description + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((description == null) ? 0 : description.hashCode());
		result = prime * result + eventid;
		result = prime * result + ((eventlocation == null) ? 0 : eventlocation.hashCode());
		result = prime * result + ((timeend == null) ? 0 : timeend.hashCode());
		result = prime * result + ((timestart == null) ? 0 : timestart.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Event other = (Event) obj;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (eventid != other.eventid)
			return false;
		if (eventlocation == null) {
			if (other.eventlocation != null)
				return false;
		} else if (!eventlocation.equals(other.eventlocation))
			return false;
		if (timeend == null) {
			if (other.timeend != null)
				return false;
		} else if (!timeend.equals(other.timeend))
			return false;
		if (timestart == null) {
			if (other.timestart != null)
				return false;
		} else if (!timestart.equals(other.timestart))
			return false;
		return true;
	}
	public int getEventid() {
		return eventid;
	}
	public void setEventid(int eventid) {
		this.eventid = eventid;
	}
	public String getTimestart() {
		return timestart;
	}
	public void setTimestart(String timestart) {
		this.timestart = timestart;
	}
	public String getTimeend() {
		return timeend;
	}
	public void setTimeend(String timeend) {
		this.timeend = timeend;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEventlocation() {
		return eventlocation;
	}
	public void setEventlocation(String eventlocation) {
		this.eventlocation = eventlocation;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
	
}
