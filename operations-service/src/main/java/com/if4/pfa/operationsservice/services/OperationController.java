package com.if4.pfa.operationsservice.services;

import com.if4.pfa.operationsservice.dao.OperationRepository;
import com.if4.pfa.operationsservice.entities.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Date;

@RestController
public class OperationController {

    @Autowired
    private OperationRepository operationRepository;

    @GetMapping("/versement/compte/{id}/montant/{montant}")
    public void verser(@PathVariable Long id, @PathVariable float montant){
        Operation opv = new Operation(id ,"versement", new Date().toString(), montant);

        ResponseEntity<Object> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8001/versement/compte/"+id+"/montant/"+montant, Object.class,
                (Object)null);
        operationRepository.save(opv);

    }

    @GetMapping("/retrait/compte/{id}/montant/{montant}")
    public void retrait(@PathVariable Long id, @PathVariable float montant){
        Operation opv = new Operation(id ,"retrait", new Date().toString(), montant);
        ResponseEntity<Object> responseEntity = new RestTemplate().getForEntity(
                "http://localhost:8001/retrait/compte/"+id+"/montant/"+montant, Object.class,
                (Object)null);
        operationRepository.save(opv);
    }


}
