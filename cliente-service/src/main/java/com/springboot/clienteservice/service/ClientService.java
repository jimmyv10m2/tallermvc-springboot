package com.springboot.clienteservice.service;

import com.springboot.clienteservice.dto.client.ClientRequestDTO;

public interface ClientService {

    void createClient(ClientRequestDTO clientRequestDTO);
}
