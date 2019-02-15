package com.if4.pfa.comptesservice.dao;

import com.if4.pfa.comptesservice.entities.Compte;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CompteRepository extends JpaRepository<Compte, Long> {

    public Compte findByIdCompte(@Param("id") Long id);

    public Page<Compte> findByIdClient(@Param("id") Long id, Pageable pageable);

}
