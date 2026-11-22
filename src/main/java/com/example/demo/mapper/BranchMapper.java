package com.example.demo.mapper;

import com.example.demo.model.Branch;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BranchMapper {

    List<Branch> getAllBranches();
}
