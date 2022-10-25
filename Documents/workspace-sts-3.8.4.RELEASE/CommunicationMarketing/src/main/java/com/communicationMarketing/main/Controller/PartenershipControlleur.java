package com.communicationMarketing.main.Controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.communicationMarketing.main.business.businessimpl.PartenershipBusiness;
import com.communicationMarketing.main.business.dtos.PartenershipDTO;
import com.communicationMarketing.main.business.ibusiness.IPartenershipBusiness;
import com.communicationMarketing.main.entity.Partenership;


@RequestMapping(path = { "/Partenership" }, produces = APPLICATION_JSON_VALUE)
@RestController
public class PartenershipControlleur {
	IPartenershipBusiness IPartenershipBusiness;

    public PartenershipControlleur(IPartenershipBusiness IPartenershipBusiness){
        this.IPartenershipBusiness=IPartenershipBusiness;
    }
    //http://localhost:8081/Partenership/add
    /*
     {
   "partenershipName":"Love" ,
    "partenershipLogo" : "nnn" ,
    "partenershipDomain":"eee",
    "partenershipWebSiteLink":null,
    "partenershipEmail":"nn" ,
    "partenershipPhone":12,
    "partenershipLinkedin":"dddd"
}
     * */

    @PostMapping("/add")
    public ResponseEntity<Partenership> addContract (@Valid @RequestBody PartenershipDTO partenership){
        return IPartenershipBusiness.addPartenership(partenership) ;
    }

    //http://localhost:8081/Partenership/allPartenerships
    @GetMapping("/allPartenerships")
    public ResponseEntity<List<Partenership>> findAllPartenerships(){
        List<Partenership> rows = IPartenershipBusiness.getAllPartenerships();
        return new ResponseEntity <>(rows, HttpStatus.OK);
    }

    @PutMapping("/update-Partenership")
    public Partenership updatePartenership(@RequestBody Partenership p){
        return IPartenershipBusiness.updatePartenership(p);
    }

    

    @DeleteMapping("/delete/{partenershipId}")
    public ResponseEntity<String> deletePartenership(@PathVariable("partenershipId") Long PartenershipId){
        return IPartenershipBusiness.deletePartenership(PartenershipId);
    }

    @GetMapping("/Partenership-by-id/{PartenershipId}")
    public ResponseEntity<?> getPartenershipByID (@PathVariable("PartenershipId") Long PartenershipId){
        return IPartenershipBusiness.getPartenershipByID(PartenershipId);
        }

    //http://localhost:8081/Partenership/count-Partenerships
    
    @GetMapping("/count-Partenerships")
    public long countPartenerships(){
        return IPartenershipBusiness.countPartenerships(); 
    }



}
