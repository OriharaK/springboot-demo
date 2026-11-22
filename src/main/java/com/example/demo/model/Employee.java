package com.example.demo.model;
import java.time.LocalDate;
import lombok.Data;

@Data
public class Employee {
    public Integer empId;
    public String name;
    private LocalDate birthDate;
    public String sex;
    public Integer salary;
    public Integer branchId;
    public Integer supId;
}
