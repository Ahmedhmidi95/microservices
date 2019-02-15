package org.opendevup.proxyservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.Collection;

import static org.springframework.http.HttpMethod.GET;


@RestController
public class ComptesGatewayRestService {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/comptes")
    public Collection<Compte> listComptes(){
        ParameterizedTypeReference<Resources<Compte>> responseType = new ParameterizedTypeReference<Resources<Compte>>() {};
        return restTemplate.exchange("http://comptes-service/comptes", GET, null, responseType).getBody().getContent();
    }
}
class Compte{

    private Long idCompte;
    private Long idClient;
    private float soldeCompte;
    private boolean etatCompte = true ;

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public double getSoldeCompte() {
        return soldeCompte;
    }

    public void setSoldeCompte(float soldeCompte) {
        this.soldeCompte = soldeCompte;
    }

    public boolean isEtatCompte() {
        return etatCompte;
    }

    public void setEtatCompte(boolean etatCompte) {
        this.etatCompte = etatCompte;
    }

}
