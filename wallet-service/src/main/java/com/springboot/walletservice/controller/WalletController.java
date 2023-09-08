package com.springboot.walletservice.controller;

import com.springboot.walletservice.dto.WalletRequestDTO;
import com.springboot.walletservice.service.WalletService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/wallets")
public class WalletController {

    private final WalletService walletService;
    @PostMapping
    public ResponseEntity<Void> createdWallet(@Valid @RequestBody WalletRequestDTO requestDTO){

        walletService.createWallet(requestDTO);

        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
