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

    // 增删改查
    public List<Branch> getALLBranches(){
        return branchMapper.getAllBranches();
    }

    public int insertBranch(Branch branch){
        return branchMapper.insertBranch(branch);
    }

    public int deleteBranch(Integer branchId){
        return branchMapper.deleteBranch(branchId);
    }

    public int updateBranch(Branch branch){
        return branchMapper.updateBranch(branch);
    }
}
