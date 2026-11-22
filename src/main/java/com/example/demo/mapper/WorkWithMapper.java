package com.example.demo.mapper;

import com.example.demo.model.WorkWith;
import com.example.demo.model.WorkWithDetailVO;
import org.apache.ibatis.annotations.Mapper;
import tools.jackson.databind.ser.WritableObjectId;

import java.util.List;

@Mapper
public interface WorkWithMapper {

    List<WorkWith> getAllWorkWiths();
    List<WorkWithDetailVO> getWorkWithDetails();
}
