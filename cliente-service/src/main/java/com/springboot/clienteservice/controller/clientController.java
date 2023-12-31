package com.springboot.clienteservice.controller;
import com.springboot.clienteservice.constant.ClientConstants;
import com.springboot.clienteservice.dto.client.ClientRequestDTO;
import com.springboot.clienteservice.service.ClientService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value= ClientConstants.BASE_URI)
@RequiredArgsConstructor
public class clientController {

    private final ClientService clientService;

    @PostMapping
    public ResponseEntity<Void>createClient (@Valid @RequestBody ClientRequestDTO requestDTO){
        clientService.createClient(requestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
