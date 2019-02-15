package com.if4.pfa.clientsservice.dao;


import com.if4.pfa.clientsservice.entities.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("select c FROM Client c where c.nomClient LIKE :nom")
    public Page<Client> findByNomClient(@Param("nom")String nom, Pageable pageable);

    @Query("select c FROM Client c where c.emailClient LIKE :email")
    public Page<Client> findByEmailClient(@Param("email")String email, Pageable pageable);

    @Query("select c FROM Client c where c.nomClient LIKE :nom AND c.prenomClient LIKE :prenom")
    public Page<Client> findBynNomClientAndPrenomClient(@Param("nom")String nom, @Param("prenom")String prenom, Pageable pageable);
}