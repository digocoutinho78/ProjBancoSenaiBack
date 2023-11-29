package com.api.senai.repositories;


import org.springframework.stereotype.Repository;

import com.api.senai.entities.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
