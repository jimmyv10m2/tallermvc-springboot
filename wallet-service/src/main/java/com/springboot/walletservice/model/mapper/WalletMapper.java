package com.springboot.walletservice.model.mapper;

import com.springboot.walletservice.dto.WalletRequestDTO;
import com.springboot.walletservice.dto.WalletResponseDTO;
import com.springboot.walletservice.model.WalletEntity;
import jakarta.validation.constraints.NotNull;

public interface WalletMapper {

    //llevamos de entidad -->dto
    WalletResponseDTO toDto (@NotNull WalletEntity walletEntity);

}
