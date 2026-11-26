package com.example.demo.service;

import com.example.demo.mapper.ClientMapper;
import com.example.demo.model.Branch;
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

    public int insertClient(Client client){
        return clientMapper.insertClient(client);
    }

    public int deleteClient(Integer clientId){
        return clientMapper.deleteClient(clientId);
    }

    public int updateClient(Client client){
        return clientMapper.updateClient(client);
    }
}
