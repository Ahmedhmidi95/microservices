package com.if4.pfa.operationsservice.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Operation implements Serializable {

    @Id
    @GeneratedValue
    private Long idOperation;
    private Long idCompte;
    private String typeOperation;
    private String dateOperation;
    private float montant;

    public Operation() {
    }

    public Operation(Long idCompte, String typeOperation, String dateOperation, float montant) {
        this.idCompte = idCompte;
        this.typeOperation = typeOperation;
        this.dateOperation = dateOperation;
        this.montant = montant;
    }

    public Long getIdOperation() {
        return idOperation;
    }

    public void setIdOperation(Long idOperation) {
        this.idOperation = idOperation;
    }

    public Long getIdCompte() {
        return idCompte;
    }

    public void setIdCompte(Long idCompte) {
        this.idCompte = idCompte;
    }

    public String getTypeOperation() {
        return typeOperation;
    }

    public void setTypeOperation(String typeOperation) {
        this.typeOperation = typeOperation;
    }

    public String getDateOperation() {
        return dateOperation;
    }

    public void setDateOperation(String dateOperation) {
        this.dateOperation = dateOperation;
    }

    public float getMontant() {
        return montant;
    }

    public void setMontant(float montant) {
        this.montant = montant;
    }
}
