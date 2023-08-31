package com.springboot.clienteservice.util;

import com.springboot.clienteservice.dto.ClientRequestDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;

@FeignClient(url = "localhost:8080/api/v1/wallets")
public interface WalletAPIClient {

    ResponseEntity<ResponseEntity> createWallet(ClientRequestDTO clientRequestDTO);
}
