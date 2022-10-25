package com.communicationMarketing.main.business.businessimpl;


import java.util.List;



import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.communicationMarketing.main.business.dtos.EventDTO;
import com.communicationMarketing.main.business.ibusiness.IEventBusiness;
import com.communicationMarketing.main.entity.event;
import com.communicationMarketing.main.repository.EventRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;

import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class EventBusiness  implements  IEventBusiness{

	
	  private static final Logger logger = LoggerFactory.getLogger(EventBusiness.class);
	    private final EventRepository eventRepository;
	    public EventBusiness(EventRepository eventRepository){
	        this.eventRepository=eventRepository;
	    }

	@Override
	public ResponseEntity<event> addEvent(EventDTO eventDTO) {

        try {
            Date date = new Date();
            Instant instanceNow = date.toInstant();
            event eventToPersist = new event(
            		eventDTO.getIdevent(),
            		eventDTO.getTitre(),
            		eventDTO.getDescription(),
            		eventDTO.getDateDebut(),
            		eventDTO.getDateFin(),
            		eventDTO.getType(),
                    eventDTO.getPrix()
                    
                  );
            eventRepository.save(eventToPersist);
            String message = "DONE ! Event added to DATABASE : " + eventToPersist;
            logger.info(message);
            return ResponseEntity.status(HttpStatus.CREATED).body(eventToPersist);
        }
        catch (Exception e){
              return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
          }


	}

	 @Transactional
	@Override
	public event updateEvent(event event) {
		 Optional<event> eventOptional= eventRepository.findById(event.getIdevent());
	    
	        return (eventOptional.isPresent() ?
	        		eventRepository.save(event)
	                : null);
}

	@Override
	public ResponseEntity<String> deleteEvent(Long id) {
	      if(eventRepository.findById(id).isPresent()){
	    	  eventRepository.deleteById(id);
	            return new ResponseEntity<>("event  deleted Successfully!", HttpStatus.OK);
	        }
	        else{
	            return new ResponseEntity<>("event not found", HttpStatus.NOT_FOUND);
	        }

	}

	@Override
	public List<event> getAllEvents() {
		   return eventRepository.findAll();
	}

	@Override
	public ResponseEntity<?> getEventByID(Long id) {
		 Optional<event> contractData = eventRepository.findById(id);
	        return contractData.map(contract -> new ResponseEntity<>(contract, HttpStatus.OK)).orElseGet(()
	                -> new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));

	}

	@Override
	public long countEvents() {
		   return eventRepository.count();
	}

}
