package com.example.demo.controller;

import com.example.demo.common.Result;
import com.example.demo.model.Branch;
import com.example.demo.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/branch")
public class BranchController {

    @Autowired
    private BranchService branchService;

    // 增删改查
    @GetMapping
    public Result<List<Branch>> getAllBranches(){
        return Result.success(branchService.getALLBranches());
    }

    @PostMapping
    public Result<Void> insertBranch(@RequestBody Branch branch){
        int rows = branchService.insertBranch(branch);
        if (rows > 0){
            return Result.success("添加成功！");
        } else {
            return Result.error("添加失败！");
        }
    }

    @DeleteMapping("/{branchId}")
    public Result<Void> deleteBranch(@PathVariable("branchId") Integer branchId){
        int rows = branchService.deleteBranch(branchId);
        if (rows > 0){
            return Result.success("删除成功！");
        } else {
            return Result.error("删除失败，未找到该部门！");
        }
    }

    @PutMapping
    public Result<Void> updateBranch(@RequestBody Branch branch){
        int rows = branchService.updateBranch(branch);
        if (rows > 0){
            return Result.success("修改成功！");
        } else {
            return Result.error("修改失败，未找到该部门！");
        }
    }
}
