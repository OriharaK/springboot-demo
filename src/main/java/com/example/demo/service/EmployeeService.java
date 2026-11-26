package com.example.demo.service;

import com.example.demo.common.PageResult;
import com.example.demo.mapper.EmployeeMapper;
import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeMapper employeeMapper;

    // 基础增删改查
    public List<Employee> getAllEmployees(){
        return employeeMapper.getAllEmployees();
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

    // 条件查询
    public List<Employee> getByBranchId(Integer branchId){
        return employeeMapper.getByBranchId(branchId);
    }

    // 分页查询
    public PageResult<Employee> getEmployeesByPage(Integer pageNum, Integer pageSize){
        // 计算offset 公式：(当前页数 - 1) * 每页条数
        int offset = (pageNum - 1) * pageSize;
        //调用 Mapper，查出当前页的数据
        List<Employee> list = employeeMapper.getEmployeesByPage(offset, pageSize);
        // 调用 Mapper，查出总共有多少条数据
        int total = employeeMapper.getTotalCount();
        // 组装成PageResult对象，返回给 Controller
        PageResult<Employee> pageResult = new PageResult<>();
        pageResult.setPageNum(pageNum);
        pageResult.setPageSize(pageSize);
        pageResult.setTotal(total);
        pageResult.setList(list); // 把查出来的当页数据塞进去

        return pageResult;
    }
}
