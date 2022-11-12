package com.dltech.service;

import com.dltech.dtos.ClienteCreateDTO;
import com.dltech.dtos.ClienteDTO;
import com.dltech.dtos.ClienteUpdateDTO;
import com.dltech.mappers.ClienteMapper;
import com.dltech.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClienteServiceImpl implements ClienteService{

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public List<ClienteDTO> listarClientes() {
        return ClienteMapper.INSTANCIA.listarClienteAListarClienteDTO(clienteRepository.findAll());
    }
}
