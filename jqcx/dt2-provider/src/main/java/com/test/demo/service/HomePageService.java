package com.test.demo.service;

import com.test.demo.model.HomePage;
import com.xm.xmap1702044.base.IBaseService;

import java.util.List;

public interface HomePageService extends IBaseService<HomePage> {
    List<HomePage>  selectName();
}
