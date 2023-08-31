package com.springboot.clienteservice.service;

import com.springboot.clienteservice.dto.ClientRequestDTO;
import com.springboot.clienteservice.dto.ClientResponseDTO;
import com.springboot.clienteservice.model.ClienteEntity;

public interface ClientService {

    void createClient(ClientRequestDTO clientRequestDTO);
}
