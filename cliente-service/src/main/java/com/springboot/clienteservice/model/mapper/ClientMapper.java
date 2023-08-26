package com.springboot.clienteservice.model.mapper;

import com.springboot.clienteservice.dto.ClientRequestDTO;
import com.springboot.clienteservice.dto.ClientResponseDTO;
import com.springboot.clienteservice.model.ClienteEntity;

public interface ClientMapper {

    //DTO--->Entity
    ClienteEntity toEntity(ClientRequestDTO dto);

    //Entity--->DTO
    ClientResponseDTO toDto(ClienteEntity entity);

}
