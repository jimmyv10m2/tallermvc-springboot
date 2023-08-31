package com.springboot.clienteservice.model;

import jakarta.persistence.*;
import lombok.*;

import javax.annotation.processing.Generated;

@Entity
@Table(name="cliente")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ClienteEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long clientId;
    private String documentNumber;
    private String phoneNumber;
    private String email;
}
