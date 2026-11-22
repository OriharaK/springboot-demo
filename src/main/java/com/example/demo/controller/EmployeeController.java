package com.example.demo.controller;

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

    @GetMapping("/getAllEmployees")
    public List<Employee> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @GetMapping("/getByBranchId")
    public Map<String, Object> geyByBranchId(@RequestParam("branchId") Integer branchId){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("employeeList", employeeService.getByBranchId(branchId));
        return hashMap;
    }

    @PostMapping("/insertEmployee")
    public String insertEmployee(@RequestBody Employee employee){
        int row = employeeService.insertEmployee(employee);
        if (row > 0) {
            return "添加成功！";
        } else {
            return "添加失败！";
        }
    }

    @PutMapping("/updateEmployee")
    public Map<String, Object> updateEmployee(@RequestBody Employee employee){
        int rows = employeeService.updateEmployee(employee);
        Map<String, Object> result = new HashMap<>();
        if (rows > 0) {
            result.put("code", 200);
            result.put("msg", "修改成功！");
        } else {
            result.put("code", 500);
            result.put("msg", "修改失败，可能找不到该员工！");
        }
        result.put("data", null);
        return result;
    }

    @DeleteMapping("/deleteEmployee")
    public Map<String, Object> deleteEmployee(@RequestParam("empId") Integer empId){
        int rows = employeeService.deleteEmployee(empId);
        Map<String, Object> result = new HashMap<>();
        if (rows > 0) {
            result.put("code", 200);
            result.put("msg", "删除成功！");
        } else {
            result.put("code", 500);
            result.put("msg", "删除失败，可能找不到该员工！");
        }
        result.put("data", null);
        return result;
    }
}
