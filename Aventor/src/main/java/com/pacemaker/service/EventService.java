package com.pacemaker.service;

import java.util.List;

import com.pacemaker.domain.Event;

public interface EventService {
	
	public void createNewEvent(Event event);
	
	public List<Event> getAllEvents();
	
	public Event getEvent(Long Id);
	
	public void updateEvent(Event event);
	
	public void deleteEvent(Long Id);
}
