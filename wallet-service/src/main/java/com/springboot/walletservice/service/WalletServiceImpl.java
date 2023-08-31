package com.springboot.walletservice.service;

import com.springboot.walletservice.dto.WalletRequestDTO;
import com.springboot.walletservice.dto.WalletResponseDTO;
import com.springboot.walletservice.model.mapper.WalletMapper;
import com.springboot.walletservice.repository.WalletRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@RequiredArgsConstructor
public class WalletServiceImpl implements WalletService{

    private final WalletRepository walletRepository;
    private final WalletMapper walletMapper;
    @Override
    public void createWallet(WalletRequestDTO walletRequestDTO) {

        if(walletRequestDTO){
            throw new RuntimeException("walletServiceImpl: error in line 23 ");
        }
        walletMapper.toDto(walletRequestDTO);

    }
}
