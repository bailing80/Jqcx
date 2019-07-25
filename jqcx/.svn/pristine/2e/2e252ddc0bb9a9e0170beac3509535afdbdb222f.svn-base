package com.test.demo.mapper;

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.test.demo.model.FoodEncy;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface FoodEncyMapper extends AutoMapper<FoodEncy> {
    List<FoodEncy> queryType(@Param(value = "type") String type);
}
