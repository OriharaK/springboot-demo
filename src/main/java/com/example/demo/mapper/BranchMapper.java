package com.example.demo.mapper;

import com.example.demo.model.Branch;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface BranchMapper {

    // 增删改查
    List<Branch> getAllBranches();
    int insertBranch(Branch branch);
    int deleteBranch(@Param("branchId") Integer branchId);
    int updateBranch(Branch branch);
}
