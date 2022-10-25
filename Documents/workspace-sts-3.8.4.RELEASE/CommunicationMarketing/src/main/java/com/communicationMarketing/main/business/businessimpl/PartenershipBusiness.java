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

import com.communicationMarketing.main.business.dtos.PartenershipDTO;
import com.communicationMarketing.main.business.ibusiness.IPartenershipBusiness;
import com.communicationMarketing.main.entity.Partenership;
import com.communicationMarketing.main.entity.event;
import com.communicationMarketing.main.repository.PartenershipRepository;


@Service
public class PartenershipBusiness implements IPartenershipBusiness {
	  private static final Logger logger = LoggerFactory.getLogger(PartenershipBusiness.class);
	    private final PartenershipRepository partenershipRepository;
	    public PartenershipBusiness(PartenershipRepository partenershipRepository){
	        this.partenershipRepository=partenershipRepository;
	    }


	@Override
	public ResponseEntity<Partenership> addPartenership(PartenershipDTO p) {
		 try {
	           
			 Partenership PartenershipToPersist = new Partenership(
					     p.getPartenershipId(),
					 	p.getPartenershipName(),
					 	p.getPartenershipLogo(),
						p.getPartenershipDomain(),
	            		p.getPartenershipWebSiteLink(),
   
	            		p.getPartenershipEmail(),
	            		p.getPartenershipPhone() ,
	            		p.getPartenershipLinkedin()
	            		
	            		
	            	
	            	
	            	   );
			 partenershipRepository.save(PartenershipToPersist);
	            String message = "DONE ! Partenaire added to DATABASE : " + PartenershipToPersist;
	            logger.info(message);
	            return ResponseEntity.status(HttpStatus.CREATED).body(PartenershipToPersist);
	        }
	        catch (Exception e){
	              return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	          }

	}


	@Transactional
	@Override
	public Partenership updatePartenership(Partenership p) {
		 Optional<Partenership> eventOptional= partenershipRepository.findById(p.getPartenershipId());
		    
	        return (eventOptional.isPresent() ?
	        		partenershipRepository.save(p)
	                : null);
	}

	@Override
	public ResponseEntity<String> deletePartenership(Long id) {
	      if(partenershipRepository.findById(id).isPresent()){
	    	  partenershipRepository.deleteById(id);
	            return new ResponseEntity<>("Partenership  deleted Successfully!", HttpStatus.OK);
	        }
	        else{
	            return new ResponseEntity<>("Partenership not found", HttpStatus.NOT_FOUND);
	        }
	}

	@Override
	public List<Partenership> getAllPartenerships() {
		   return partenershipRepository.findAll();

	}

	@Override
	public ResponseEntity<?> getPartenershipByID(Long id) {
		 Optional<Partenership> contractData = partenershipRepository.findById(id);
	        return contractData.map(contract -> new ResponseEntity<>(contract, HttpStatus.OK)).orElseGet(()
	                -> new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR));

	
	}

	@Override
	public long countPartenerships() {
		   return partenershipRepository.count();
	}

}
