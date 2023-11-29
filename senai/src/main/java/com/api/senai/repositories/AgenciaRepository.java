package com.api.senai.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.senai.entities.Agencia;

@Repository
public interface AgenciaRepository extends JpaRepository<Agencia, Long>{
    
}
