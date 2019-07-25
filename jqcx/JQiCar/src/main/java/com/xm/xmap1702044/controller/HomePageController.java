package com.xm.xmap1702044.controller;

import com.test.demo.model.HomePage;
import com.test.demo.service.HomePageService;
import net.sf.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.font.Type1Font;

import java.util.List;

/**
 * @author bailing
 * @create 2018年7月19日15:22:22
 * @desc
 **/
@Controller
@RequestMapping("/HomePageService")
public class HomePageController {
    @Autowired
    private HomePageService homePageService;

    @RequestMapping(value = "manageList")
    @ResponseBody
    public JSONObject  /* List<HomePage>*/ manageList() throws Exception {
        JSONObject jsonObject = new JSONObject();
        List<HomePage> list = null;
      //  try {
            list = homePageService.selectName();
      //  } catch (Exception e) {
      //      e.printStackTrace();
      //  }
       jsonObject.put("list", list);
        return jsonObject;   //list;//
    }
}
