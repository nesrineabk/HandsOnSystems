package com.HandsOnSystems.main.Controller;



import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import  com.HandsOnSystems.main.Service.HelloWorldService;
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping(path = { "/World" }, produces = APPLICATION_JSON_VALUE)
@RestController
public class WorldController {
	
	
	  @Autowired
	
	private  HelloWorldService helloWorldService;
	
	
	   @GetMapping("/hello")
	    public String Message(){
		   System.out.println(helloWorldService.getMessage());

	        return helloWorldService.getMessage();
	    }

}
