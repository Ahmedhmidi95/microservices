package com.if4.pfa.clientsservice.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Client implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id_client")
    private Long idClient;
    @Column(name="nom_client")
    private String nomClient;
    @Column(name="prenom_client")
    private String prenomClient;
    @Column(name="email_client")
    private String emailClient;

    public Client() {
    }

    public Client(String nomClient, String prenomClient, String emailClient) {
        this.nomClient = nomClient;
        this.prenomClient = prenomClient;
        this.emailClient = emailClient;
    }

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
