package com.example.demo.service;

import com.example.demo.mapper.BranchMapper;
import com.example.demo.model.Branch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BranchService {

    @Autowired
    private BranchMapper branchMapper;

    public List<Branch> getALLBranches(){
        return branchMapper.getAllBranches();
    }
}
