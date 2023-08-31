package com.springboot.walletservice.model;

import jakarta.persistence.*;
import lombok.*;

import java.math.BigDecimal;

@Entity
@Table(name="wallet")
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
@Builder
public class WalletEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long walletId;
    private String ClientDocumentNumber;
    private BigDecimal balance;
    private String currency;//tipo de moneda
}
