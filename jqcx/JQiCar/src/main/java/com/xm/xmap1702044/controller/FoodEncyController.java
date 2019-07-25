package com.xm.xmap1702044.controller;


import com.test.demo.model.FoodEncy;
import com.test.demo.service.FoodEncyService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @autho xuzhiyuan
 * @create 2018年7月17日16:18:22
 * @desc
 **/
@Controller
@RequestMapping("/FoodEncyService")
public class FoodEncyController {
    @Autowired
    private FoodEncyService foodEncyService;

    @RequestMapping(value = "manageList")
    @ResponseBody
    public JSONObject manageList(String foodType) throws Exception{
        JSONObject jsonObject = new JSONObject();
        List<FoodEncy> list=null;
        try {
            list = foodEncyService.queryType(foodType);
        } catch (Exception e) {
            e.printStackTrace();
        }
        jsonObject.put("list",list);
        return jsonObject;
    }
}
