package com.springboot.walletservice.model.mapper;

import com.springboot.walletservice.dto.WalletResponseDTO;
import com.springboot.walletservice.model.WalletEntity;
import jakarta.validation.constraints.NotNull;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

@Component //para que spring lo maneje como un bean
@Validated
public class WalletMapperImpl implements WalletMapper{


    @Override
    public WalletResponseDTO toDto(@NotNull WalletEntity walletEntity) {
        return null;
    }
}
