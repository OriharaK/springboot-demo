package com.example.demo.controller;


import com.example.demo.common.Result;
import com.example.demo.mapper.ClientMapper;
import com.example.demo.model.Branch;
import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    private ClientService clientService;
    @Autowired
    private ClientMapper clientMapper;

    // 增删改查
    @GetMapping
    public Result<List<Client>> getAllClients(){
        return Result.success(clientService.getAllClients());
    }

    @PostMapping
    public Result<Void> insertClient(@RequestBody Client client){
        int rows = clientService.insertClient(client);
        if (rows > 0){
            return Result.success("添加成功！");
        } else {
            return Result.error("添加失败！");
        }
    }

    @DeleteMapping("/{clientId}")
    public Result<Void> deleteClient(@PathVariable("clientId") Integer clientId){
        int rows = clientService.deleteClient(clientId);
        if (rows > 0){
            return Result.success("删除成功！");
        } else {
            return Result.error("删除失败，未找到该部门！");
        }
    }

    @PutMapping
    public Result<Void> updateClient(@RequestBody Client client){
        int rows = clientService.updateClient(client);
        if (rows > 0){
            return Result.success("修改成功！");
        } else {
            return Result.error("修改失败，未找到该部门！");
        }
    }
}
