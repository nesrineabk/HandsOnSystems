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

import com.communicationMarketing.main.business.dtos.GEDDTO;
import com.communicationMarketing.main.business.ibusiness.*;
import com.communicationMarketing.main.entity.GED;


@RequestMapping(path = { "/GED" }, produces = APPLICATION_JSON_VALUE)
@RestController
public class GEDControlleur {
	
	IGEDBusiness IGEDBusiness;

    public GEDControlleur(IGEDBusiness IGEDBusiness){
        this.IGEDBusiness=IGEDBusiness;
    }
//http://localhost:8081/GED/add
    @PostMapping("/add")
    public ResponseEntity<GED> addGEd (@Valid @RequestBody GEDDTO GEDDTO){
        return IGEDBusiness.addGED(GEDDTO );
    }
   // http://localhost:8081/GED/allGEDs
    @GetMapping("/allGEDs")
    public ResponseEntity<List<GED>> findAllGEDs(){
        List<GED> rows = IGEDBusiness.getAllGEDs();
        return new ResponseEntity <>(rows, HttpStatus.OK);
    }


    @PutMapping("/update-GED")
    public GED updateGED(@RequestBody GED ged){
        return IGEDBusiness.updateGED(ged); 
    }


    @DeleteMapping("/delete/{idGED}")
    public ResponseEntity<String> deleteGED(@PathVariable("idGED") Long idGED){
        return IGEDBusiness.deleteGED(idGED);
    }

    
    @GetMapping("/GED-by-id/{idGED}")
    public ResponseEntity<?> getGEDByID (@PathVariable("idGED") Long idGED){
        return IGEDBusiness.getGEDByID(idGED);
    }


    //http://localhost:8081/GED/count-Events
    @GetMapping("/count-Events")
    public long countEvents(){
        return IGEDBusiness.countGEDs(); 
    }


}
