package com.communicationMarketing.main.business.businessimpl;

import java.time.Instant;



import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.communicationMarketing.main.business.dtos.GEDDTO;
import com.communicationMarketing.main.business.ibusiness.IGEDBusiness;

import com.communicationMarketing.main.entity.GED;

import com.communicationMarketing.main.repository.GEDRepos;

@Service
public class GedBuiness   implements  IGEDBusiness{
	
	  private static final Logger logger = LoggerFactory.getLogger(GedBuiness.class);
	    private final GEDRepos gedRepos;
	    public GedBuiness(GEDRepos gedRepos){
	        this.gedRepos=gedRepos;
	    }

	@Override
	public ResponseEntity<GED> addGED(GEDDTO gedDTO) {
		 try {
	           // Date date = new Date();
	            //Instant instanceNow = date.toInstant();
	            GED GEDToPersist = new GED(
	            		gedDTO.getIdGED(),
	            		gedDTO.getTitle(),
	            		gedDTO.getDescription(),
	            		gedDTO.getDateCreation() , 
	            		gedDTO.getContent(),
	            		gedDTO.getContentType()
	             );
	            gedRepos.save(GEDToPersist);
	            String message = "DONE ! Event added to DATABASE : " + GEDToPersist;
	            logger.info(message);
	            return ResponseEntity.status(HttpStatus.CREATED).body(GEDToPersist);
	        }
	        catch (Exception e){
	              return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	          }
	}

	
	@Transactional
	@Override
	public GED updateGED(GED ged) {
		 Optional<GED> gedOptional= gedRepos.findById(ged.getIdGED());
		    
	        return (gedOptional.isPresent() ?
	        		gedRepos.save(ged)
	                : null);
	}

	@Override
	public ResponseEntity<String> deleteGED(Long id) {
	      if(gedRepos.findById(id).isPresent()){
	    	  gedRepos.deleteById(id);
	            return new ResponseEntity<>("ged  deleted Successfully!", HttpStatus.OK);
	        }
	        else{
	            return new ResponseEntity<>("ged  not found", HttpStatus.NOT_FOUND);
	        }

	}

	@Override
	public List<GED> getAllGEDs() {

		   return gedRepos.findAll();
	
	}

	@Override
	public ResponseEntity<?> getGEDByID(Long id) {
		 Optional<GED> gedData = gedRepos.findById(id);
	        return gedData.map(GED -> new ResponseEntity<>(GED, HttpStatus.OK)).orElseGet(()
	                -> new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));

	}
	


	@Override
	public long countGEDs() {
		   return gedRepos.count();

	}

}
