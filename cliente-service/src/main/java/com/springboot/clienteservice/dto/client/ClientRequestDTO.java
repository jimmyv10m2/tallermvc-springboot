package com.springboot.clienteservice.dto.client;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;

@Builder
public record ClientRequestDTO(
        @NotEmpty @NotBlank String documentNumber,
        @NotEmpty @NotBlank String phoneNumber,
        @Email String email
) {
    //record: nueva forma de declarar las clases(inmutables) java donde ya incorpora los getter y setter
}
