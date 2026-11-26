package com.example.demo.controller;

import com.example.demo.common.PageResult;
import com.example.demo.common.Result;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // 增删改查
    @GetMapping
    public Result<List<Employee>> getAllEmployees(){
        List<Employee> list = employeeService.getAllEmployees();
        return Result.success(list);
    }

    @PostMapping
    public Result<Void> insertEmployee(@RequestBody Employee employee){
        int row = employeeService.insertEmployee(employee);
        if (row > 0) {
            return Result.success("添加成功！");
        } else {
            return Result.error("添加失败!");
        }
    }

    @PutMapping
    public Result<Void> updateEmployee(@RequestBody Employee employee){
        int rows = employeeService.updateEmployee(employee);
        if (rows > 0) {
            return Result.success("修改成功！");
        } else {
            return Result.error("修改失败，可能找不到该员工！");
        }
    }

    @DeleteMapping("/{empId}")
    public Result<Void> deleteEmployee(@PathVariable("empId") Integer empId){
        int rows = employeeService.deleteEmployee(empId);
        if (rows > 0) {
            return Result.success("删除成功！");
        } else {
            return Result.success("删除失败，可能找不到该员工！");
        }
    }

    // 条件查询
    @GetMapping("/branch/{branchId}")
    public Result<List<Employee>> geyByBranchId(@PathVariable("branchId") Integer branchId){
        return Result.success(employeeService.getByBranchId(branchId));
    }

    // 分页查询员工
    @GetMapping("/page")
    public Result<PageResult<Employee>> getPage(
            @RequestParam(defaultValue = "1") Integer pageNum,
            @RequestParam(defaultValue = "2") Integer pageSize
    ){
        PageResult<Employee> pageResult = employeeService.getEmployeesByPage(pageNum, pageSize);
        return Result.success(pageResult); // 装箱，然后直接扔给前端
    }
}
