package com.springboot.clienteservice.dto.client;

import lombok.Builder;

@Builder
public record ClientResponseDTO (
        Long clientId,
        String documentNumber,
        String phoneNumber,
        String email
){
    //record: nueva forma de declarar las clases(inmutables) java donde ya incorpora los getter y setter
}
