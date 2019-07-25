package com.test.demo.service.impl;

import com.baomidou.framework.service.impl.SuperServiceImpl;
import com.test.demo.mapper.HomePageMapper;
import com.test.demo.model.HomePage;
import com.test.demo.service.HomePageService;
import com.xm.xmap1702044.base.PageManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sun.misc.BASE64Encoder;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.SQLException;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * @author bailing
 * @create 2018年7月18日15:39:32
 * @desc
 **/
@Service(value = "HomePageService")



public class HomePageServiceImpl extends SuperServiceImpl<HomePageMapper,HomePage> implements HomePageService {
    //子类继承父类调用HomePage接口
    @Autowired
    private HomePageMapper homePageMapper;

    @Override
    public List<HomePage> selectName() {
        List<HomePage> list=null;
        try {
            list = homePageMapper.selectName();
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

  /*  *//**
     * 去掉空格回车换行符
     * @param str
     * @return
     *//*
    public static String replaceBlank(String str) {
        String dest = "";
        if (str!=null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }

    *//**
     * blob类型转base64
     *
     * @param
     * @return
     *//*
    public static String convertBlobToBase64String(Blob blob) {
        String result = "";
        if(null != blob) {
            try {
                InputStream msgContent = blob.getBinaryStream();
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                byte[] buffer = new byte[100];
                int n = 0;
                while (-1 != (n = msgContent.read(buffer))) {
                    output.write(buffer, 0, n);
                }
                result =new BASE64Encoder().encode(output.toByteArray()) ;
                output.close();
            } catch (SQLException e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return result;
        }else {
            return null;
        }
    }
*/
    //定义
   /* @Override
    public List<HomePage> queryType(String type) {
        return null;
    }*/

    @Override
    public PageManager query(HomePage homePage, PageManager page) {
        return null;
    }

    @Override
    public HomePage get(HomePage homePage) {
        return null;
    }

    @Override
    public int save(HomePage homePage) {
        return 0;
    }

    @Override
    public int update(HomePage homePage) {
        return 0;
    }

    @Override
    public int delete(HomePage homePage) {
        return 0;
    }
}




