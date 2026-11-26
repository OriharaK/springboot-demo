package com.example.demo.common;

import lombok.Data;
import java.util.List;

@Data
public class PageResult<T> {
    private Integer total;      // 总记录数（比如数据库有5条）
    private Integer pageNum;    // 当前是第几页（比如第1页）
    private Integer pageSize;   // 每页显示几条（比如每页2条）
    private List<T> list;       // 当前页的真实数据（查出来的2个员工）
}
