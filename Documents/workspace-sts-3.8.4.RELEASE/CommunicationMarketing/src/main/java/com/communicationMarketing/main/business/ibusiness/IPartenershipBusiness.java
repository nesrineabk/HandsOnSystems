package com.communicationMarketing.main.business.ibusiness;

import java.util.List;


import org.springframework.http.ResponseEntity;

import com.communicationMarketing.main.business.dtos.PartenershipDTO;
import com.communicationMarketing.main.entity.Partenership;



public interface IPartenershipBusiness {
	  ResponseEntity<Partenership> addPartenership (PartenershipDTO PartenershiptDTO);
	  Partenership updatePartenership (Partenership p);
	    ResponseEntity<String> deletePartenership (Long id);
	    List<Partenership> getAllPartenerships ();
	    ResponseEntity<?> getPartenershipByID(Long id);
	    long countPartenerships();
}
