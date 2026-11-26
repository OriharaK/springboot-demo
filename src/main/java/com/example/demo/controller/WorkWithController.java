package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.model.WorkWith;
import com.example.demo.model.WorkWithDetailVO;
import com.example.demo.service.WorkWithService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/workwith")
public class WorkWithController {

    @Autowired
    private WorkWithService workWithService;

    @GetMapping
    public Result<List<WorkWith>> getAllWorkWiths(){
        return Result.success(workWithService.getAllWorkWiths());
    }

    @GetMapping("/details")
    public Result<List<WorkWithDetailVO>> getWorkWithDetails(){
        return Result.success(workWithService.getWorkWithDetails());
    }
}
