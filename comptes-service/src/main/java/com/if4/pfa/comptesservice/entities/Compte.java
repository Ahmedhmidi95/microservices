package com.if4.pfa.comptesservice.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Compte implements Serializable {

    @Id
    @GeneratedValue
    @Column(name="id_compte")
    private Long idCompte;
    @Column(name="id_client")
    private Long idClient;
    @Column(name="solde")
    private float soldeCompte;
    @Column(name="etat")
    private boolean etatCompte = true ;

    public Compte() {
    }

    public Compte(Long idClient, float soldeCompte, boolean etatCompte) {
        this.idClient = idClient;
        this.soldeCompte = soldeCompte;
        this.etatCompte = etatCompte;
    }

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
