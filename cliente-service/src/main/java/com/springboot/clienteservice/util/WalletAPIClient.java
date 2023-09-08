package com.springboot.clienteservice.util;

import com.springboot.clienteservice.dto.wallet.WalletRequestDTO;
import jakarta.validation.Valid;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "WALLET-SERVICE", url = "localhost:8081/api/v1/wallets")
public interface WalletAPIClient {

    @PostMapping
    void createdWallet(@Valid @RequestBody WalletRequestDTO requestDTO);
    //ESTE METODO TIENE QUE SER IGUAL AL METODO DEL CONTROLLER DE LA APIREST CON LA QUE SE ESTA CONECTANDO
}
