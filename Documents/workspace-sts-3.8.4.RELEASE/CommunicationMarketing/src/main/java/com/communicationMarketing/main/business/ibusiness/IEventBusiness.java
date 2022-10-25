package com.communicationMarketing.main.business.ibusiness;

import com.communicationMarketing.main.business.dtos.EventDTO;
import com.communicationMarketing.main.entity.event;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface IEventBusiness {

	    ResponseEntity<event> addEvent (EventDTO contractDTO);
	    event updateEvent (event event);
	    ResponseEntity<String> deleteEvent (Long id);
	    List<event> getAllEvents ();
	    ResponseEntity<?> getEventByID(Long id);
	    long countEvents();

	
}
