package com.example.demo.service;

import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    public List<Employee> getAllEmployees(){
        return employeeMapper.getAllEmployees();
    }

    public List<Employee> getByBranchId(Integer branchId){
        return employeeMapper.getByBranchId(branchId);
    }

    public int insertEmployee(Employee employee){
        return employeeMapper.insertEmployee(employee);
    }

    public int updateEmployee(Employee employee){
        return employeeMapper.updateEmployee(employee);
    }

    public int deleteEmployee(Integer empId){
        return employeeMapper.deleteEmployee(empId);
    }
}
