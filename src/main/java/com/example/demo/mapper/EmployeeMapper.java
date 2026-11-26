package com.example.demo.mapper;

import com.example.demo.model.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface EmployeeMapper {
    // 基础CRUD
    List<Employee> getAllEmployees();
    int insertEmployee(Employee employee);
    int updateEmployee(Employee employee);
    int deleteEmployee(@Param("empId") Integer empId);

    // 条件查询
    List<Employee> getByBranchId(@Param("branchId") Integer branchId);

    // 分页查询（数据库用LIMIT）
    List<Employee> getEmployeesByPage(@Param("offset") Integer offset, @Param("pageSize") Integer pageSize);

    // 查总条数（前端靠这个算总页数）
    int getTotalCount();
}
