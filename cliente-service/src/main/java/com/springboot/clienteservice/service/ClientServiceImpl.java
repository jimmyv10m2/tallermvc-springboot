package com.springboot.clienteservice.service;

import com.springboot.clienteservice.dto.ClientRequestDTO;
import com.springboot.clienteservice.dto.ClientResponseDTO;
import com.springboot.clienteservice.model.ClienteEntity;
import com.springboot.clienteservice.model.mapper.ClientMapper;
import com.springboot.clienteservice.repository.ClientRepository;
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
    @Override
    public void createClient(ClientRequestDTO clientRequestDTO) {

        if(Objects.isNull(clientRequestDTO))
            throw new RuntimeException("La Request no puede obtener un objeto vacio");

        ClienteEntity client=clientMapper.toEntity(clientRequestDTO);
        client =clientRepository.save(client);


    }


}
