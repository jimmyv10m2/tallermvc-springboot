package com.springboot.clienteservice.model.mapper;

import com.springboot.clienteservice.dto.ClientRequestDTO;
import com.springboot.clienteservice.dto.ClientResponseDTO;
import com.springboot.clienteservice.model.ClienteEntity;
import org.springframework.stereotype.Component;

//clase que se encarga de maperar los datos de los DTO a Entity y viceversa
@Component //es un bean
public class ClientMapperImpl implements ClientMapper{

    @Override
    public ClienteEntity toEntity(ClientRequestDTO dto) {
        return ClienteEntity.builder()
                .documentNumber(dto.documentNumber())
                .phoneNumber(dto.phoneNumber())
                .email(dto.email())
                .build();
    }

    @Override
    public ClientResponseDTO toDto(ClienteEntity entity) {
        return ClientResponseDTO.builder()
                .clientId(entity.getClientId())
                .documentNumber(entity.getDocumentNumber())
                .phoneNumber(entity.getPhoneNumber())
                .email(entity.getEmail())
                .build();
    }
}
