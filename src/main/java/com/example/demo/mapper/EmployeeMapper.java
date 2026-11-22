package com.example.demo.mapper;

import com.example.demo.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getAllEmployees();
    List<Employee> getByBranchId(@Param("branchId") Integer branchId);
    int insertEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteEmployee(@Param("empId") Integer empId);
}
