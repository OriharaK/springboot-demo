package com.example.demo.model;

import lombok.Data;

@Data
public class WorkWithDetailVO {
    private Integer empId;
    private String empName;
    private Integer clientId;
    private String clientName;
    private Integer totalSales;
}
