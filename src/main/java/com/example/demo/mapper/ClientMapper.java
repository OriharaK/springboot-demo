package com.example.demo.mapper;

import com.example.demo.model.Client;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ClientMapper {

    List<Client> getAllClients();

}
