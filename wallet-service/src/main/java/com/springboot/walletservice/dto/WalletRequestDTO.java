package com.springboot.walletservice.dto;

import jakarta.validation.constraints.NotNull;
import lombok.Builder;

@Builder
public class WalletRequestDTO {

    @NotNull String clientDocumentNumber;
}
