package com.example.demo.controller;

import com.example.demo.model.Branch;
import com.example.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    @GetMapping("/getAllBranches")
    public List<Branch> getAllBranches(){
        return branchService.getALLBranches();
    }
}
