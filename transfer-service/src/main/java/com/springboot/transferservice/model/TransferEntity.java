package com.springboot.transferservice.model;

import java.math.BigDecimal;

public class TransferEntity {

    private Long tranferid;
    private Long originWalletId;
    private Long destinationWalletId;
    private BigDecimal amount;
    private String currency;
}
