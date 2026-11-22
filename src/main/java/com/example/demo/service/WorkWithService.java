package com.example.demo.service;

import com.example.demo.mapper.WorkWithMapper;
import com.example.demo.model.WorkWith;
import com.example.demo.model.WorkWithDetailVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class WorkWithService {

    @Autowired
    private WorkWithMapper workWithMapper;

    public List<WorkWith> getAllWorkWiths(){
        return workWithMapper.getAllWorkWiths();
    }

    public List<WorkWithDetailVO> getWorkWithDetails(){
        return workWithMapper.getWorkWithDetails();
    }
}
