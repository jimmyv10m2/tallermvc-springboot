package com.springboot.clienteservice.repository;

import com.springboot.clienteservice.model.ClienteEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClienteEntity,Long> {
}
