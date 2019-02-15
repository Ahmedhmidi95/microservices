package com.if4.pfa.comptesservice.services;

import com.if4.pfa.comptesservice.dao.CompteRepository;
import com.if4.pfa.comptesservice.entities.Compte;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class CompteController {
    @Autowired
    private CompteRepository compteRepository;

    @GetMapping("/versement/compte/{id}/montant/{montant}")
    public void verser(@PathVariable Long id, @PathVariable float montant){

        Compte compte = compteRepository.findByIdCompte(id);
        float newSolde = (float) (compte.getSoldeCompte()+montant);
        compte.setSoldeCompte(newSolde);
        compteRepository.save(compte);
    }

    @GetMapping("/retrait/compte/{id}/montant/{montant}")
    public void retrait(@PathVariable Long id, @PathVariable float montant){

        Compte compte = compteRepository.findByIdCompte(id);
        float newSolde = (float) (compte.getSoldeCompte()-montant);
        if (newSolde < 0){
            compte.setSoldeCompte(0);
        }else{
            compte.setSoldeCompte(newSolde);
        }
        compteRepository.save(compte);

    }
}
