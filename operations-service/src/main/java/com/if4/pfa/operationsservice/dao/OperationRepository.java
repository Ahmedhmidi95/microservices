package com.if4.pfa.operationsservice.dao;

import com.if4.pfa.operationsservice.entities.Operation;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface OperationRepository extends JpaRepository<Operation, Long> {
    public Page<Operation> findByIdCompte(@Param("id")Long id, Pageable pageable);
    public Page<Operation> findByTypeOperation(@Param("type")String type, Pageable pageable);
}
