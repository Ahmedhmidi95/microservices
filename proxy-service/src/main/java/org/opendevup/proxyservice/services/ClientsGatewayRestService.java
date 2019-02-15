package org.opendevup.proxyservice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.hateoas.Resources;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.io.Serializable;
import java.util.Collection;

import static org.springframework.http.HttpMethod.GET;


@RestController
public class ClientsGatewayRestService {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/clients")
    public Collection<Client> listClients(){
        ParameterizedTypeReference<Resources<Client>> responseType = new ParameterizedTypeReference<Resources<Client>>() {};
        return restTemplate.exchange("http://clients-service/clients", GET, null, responseType).getBody().getContent();
    }
}

class Client {
    private Long idClient;
    private String nomClient;
    private String prenomClient;
    private String emailClient;

    public Long getIdClient() {
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    public String getPrenomClient() {
        return prenomClient;
    }

    public void setPrenomClient(String prenomClient) {
        this.prenomClient = prenomClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }
}