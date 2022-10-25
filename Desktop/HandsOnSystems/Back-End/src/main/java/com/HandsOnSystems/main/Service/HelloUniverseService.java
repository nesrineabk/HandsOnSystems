package com.HandsOnSystems.main.Service;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.HandsOnSystems.main.IService.IMessageService;


@Primary
@Service
public class HelloUniverseService implements  IMessageService  {


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
                    message = message+"\n"+i+": Universe";
                }
            } if (i % 3 == 0 && i % 5 == 0) {
                if (message == "") {
                    message = i+": Hello Universe";  
                } else {
                    message = message+"\n"+i+": Hello Universe";
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