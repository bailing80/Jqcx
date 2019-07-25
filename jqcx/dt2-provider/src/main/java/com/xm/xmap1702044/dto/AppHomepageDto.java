package com.xm.xmap1702044.dto;

import com.baomidou.mybatisplus.annotations.TableField;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;

/**
 * @program: dt2
 * @description:
 * @author: bailing
 * @create: 2018-07-17 15:00
 **/
@Service(value = "AppHomepageDto")
public class AppHomepageDto {
    @TableField(exist = false)
    private int id;
    //用户id
    private BufferedImage foodPic;
    //美食图片
    private String foodTopic;
    //食物主题
    private String description;
    //食物描述
    private String user;
    //用户名
    private BufferedImage userPic;
    //用户的头像
    private int goodNum;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BufferedImage getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(BufferedImage foodPic) {
        this.foodPic = foodPic;
    }

    public String getFoodTopic() {
        return foodTopic;
    }

    public void setFoodTopic(String foodTopic) {
        this.foodTopic = foodTopic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public BufferedImage getUserPic() {
        return userPic;
    }

    public void setUserPic(BufferedImage userPic) {
        this.userPic = userPic;
    }

    public int getGoodNum() {
        return goodNum;
    }

    public void setGoodNum(int goodNum) {
        this.goodNum = goodNum;
    }
}
