package com.pacemaker.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pacemaker.domain.Event;
import com.pacemaker.repository.EventRepository;
import com.pacemaker.service.EventService;

@Service("eventService")
@Transactional
public class EventServiceImplementation implements EventService {

	@Autowired
	EventRepository eventRepository;
	
	@Override
	public void createNewEvent(Event event) {
		
		eventRepository.saveAndFlush(event);
	}

	@Override
	public List<Event> getAllEvents() {
		
		return eventRepository.findAll();
	}

	@Override
	public Event getEvent(Long Id) {
		
		return eventRepository.getOne(Id);
	}

	@Override
	public void updateEvent(Event event) {
		
		eventRepository.saveAndFlush(event);		
	}

	@Override
	public void deleteEvent(Long Id) {
		
		eventRepository.delete(Id);
	}

}
