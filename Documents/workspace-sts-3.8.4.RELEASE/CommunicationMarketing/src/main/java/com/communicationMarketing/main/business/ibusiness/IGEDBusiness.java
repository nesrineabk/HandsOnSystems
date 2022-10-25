package com.communicationMarketing.main.business.ibusiness;

import java.util.List;

import org.springframework.http.ResponseEntity;
import com.communicationMarketing.main.business.dtos.GEDDTO;
import com.communicationMarketing.main.entity.GED;


public interface IGEDBusiness {
    ResponseEntity<GED> addGED (GEDDTO contractDTO);
    GED updateGED (GED ged);
    ResponseEntity<String> deleteGED (Long id);
    List<GED> getAllGEDs ();
    ResponseEntity<?> getGEDByID(Long id);
    long countGEDs();

}
