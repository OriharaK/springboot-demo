package com.example.demo.service;

import com.example.demo.mapper.ClientMapper;
import com.example.demo.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientMapper clientMapper;

    public List<Client> getAllClients(){
        return clientMapper.getAllClients();
    }
}
