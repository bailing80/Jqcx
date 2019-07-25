package com.test.demo.mapper;

import com.baomidou.mybatisplus.mapper.AutoMapper;
import com.test.demo.model.HomePage;

import java.util.List;
public interface HomePageMapper extends AutoMapper<HomePage> {
    //AutoMapper是一款单向映射
    List<HomePage> selectName();
}

