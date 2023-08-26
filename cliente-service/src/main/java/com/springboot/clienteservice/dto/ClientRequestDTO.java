package com.springboot.clienteservice.dto;

import lombok.Builder;

@Builder
public record ClientRequestDTO(
        Integer documentNumber,
        String phoneNumber,
        String email
) {
    //record: nueva forma de declarar las clases(inmutables) java donde ya incorpora los getter y setter
}
