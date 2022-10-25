package com.communicationMarketing.main.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.communicationMarketing.main.business.dtos.EventDTO;
import com.communicationMarketing.main.business.ibusiness.*;
import com.communicationMarketing.main.entity.event;

import javax.validation.Valid;
import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;


@RequestMapping(path = { "/Event" }, produces = APPLICATION_JSON_VALUE)
@RestController
public class EventControlleur {
	IEventBusiness IEventBusiness;

	    public EventControlleur(IEventBusiness IEventBusiness){
	        this.IEventBusiness=IEventBusiness;
	    }
//http://localhost:8081/Event/add
	    /*
	     {
    "idevent" :3,
    "titre":"nesrine abk " ,
    "description" : "nnn" ,
    "dateDebut":null,
    "dateFin":null,
    "type":"nn",
    "prix":1.2


}
	      */
	    @PostMapping("/add")
	    public ResponseEntity<event> addContract (@Valid @RequestBody EventDTO eventDTO){
	        return IEventBusiness.addEvent(eventDTO);
	    }
        //http://localhost:8081/Event/allEvents
	    @GetMapping("/allEvents")
	    public ResponseEntity<List<event>> findAllEvents(){
	        List<event> rows = IEventBusiness.getAllEvents();
	        return new ResponseEntity <>(rows, HttpStatus.OK);
	    }

//http://localhost:8081/Event/update-event
	    @PutMapping("/update-event")
	    public event updateevent(@RequestBody event event){
	        return IEventBusiness.updateEvent(event);
	    }

	    
	    //http://localhost:8081/Event/delete/2

	    @DeleteMapping("/delete/{idevent}")
	    public ResponseEntity<String> deleteEvent(@PathVariable("idevent") Long idevent){
	        return IEventBusiness.deleteEvent(idevent);
	    }

	    //http://localhost:8081/Event/Event-by-id/2
	    @GetMapping("/Event-by-id/{idevent}")
	    public ResponseEntity<?> getEventByID (@PathVariable("idevent") Long idevent){
	        return IEventBusiness.getEventByID(idevent);
	    }

	    
	    //http://localhost:8081/Event/count-Events
	    @GetMapping("/count-Events")
	    public long countEvents(){
	        return IEventBusiness.countEvents();
	    }



}
