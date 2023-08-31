package com.springboot.walletservice.service;

import com.springboot.walletservice.dto.WalletRequestDTO;
import com.springboot.walletservice.dto.WalletResponseDTO;

public interface WalletService {

    //¿que devolvemos?
    void createWallet(WalletRequestDTO walletRequestDTO);
}
