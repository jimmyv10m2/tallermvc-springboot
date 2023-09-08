package com.springboot.clienteservice.service;

import com.springboot.clienteservice.dto.client.ClientRequestDTO;
import com.springboot.clienteservice.dto.wallet.WalletRequestDTO;
import com.springboot.clienteservice.model.ClienteEntity;
import com.springboot.clienteservice.model.mapper.ClientMapper;
import com.springboot.clienteservice.repository.ClientRepository;
import com.springboot.clienteservice.util.WalletAPIClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service //porque esta clase es un servicio
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService{
    //en esta clase se realiza la logica de negocio
    //se comunica con la entidad y dto
    //final: para usar el patron singleton

    private final ClientRepository clientRepository;
    private final ClientMapper clientMapper;//porque se va obtener un dto pero sera tranformado en entidad
    private final WalletAPIClient walletAPIClient;
    @Override
    public void createClient(ClientRequestDTO clientRequestDTO) {

        if(Objects.isNull(clientRequestDTO))
            throw new RuntimeException("ClientServiceImpl: error en linea 26");

        ClienteEntity client=clientMapper.toEntity(clientRequestDTO);

        WalletRequestDTO walletRequestDTO= WalletRequestDTO.builder()
                .clientDocumentNumber(client.getDocumentNumber())
                .build();

        walletAPIClient.createdWallet(walletRequestDTO);

        client =clientRepository.save(client);
    }
}
