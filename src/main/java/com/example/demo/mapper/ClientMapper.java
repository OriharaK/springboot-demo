package com.example.demo.mapper;

import com.example.demo.model.Branch;
import com.example.demo.model.Client;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface ClientMapper {

    // 增删改查
    List<Client> getAllClients();
    int insertClient(Client client);
    int deleteClient(@Param("clientId") Integer clientId);
    int updateClient(Client client);
}
