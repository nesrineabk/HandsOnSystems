package com.HandsOnSystems.main.Service;


import org.springframework.stereotype.Service;

import com.HandsOnSystems.main.IService.IMessageService;


@Service
public class HelloWorldService implements  IMessageService {
	
	
	

	@Override
	public  String getMessage() {
        String message = "";
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 != 0) {
                if (message == "") {
                    message = i+": Hello";  
                } else {
                    message = message+"\n"+i+": Hello";
                }
            } if (i % 5 == 0 && i % 3 != 0) {
                if (message == "") {
                    message = i+": World";  
                } else {
                    message = message+"\n"+i+": World";
                }
            } if (i % 3 == 0 && i % 5 == 0) {
                if (message == "") {
                    message = i+": Hello World";  
                } else {
                    message = message+"\n"+i+": Hello World";
                }
            } else {
                if (message == "") {
                    message = i+": "+i;  
                } else {
                    message = message+"\n"+i+": "+i;
                }
            }
        }
        return message;
    }
	
}
