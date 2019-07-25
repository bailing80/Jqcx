package com.test.demo.model;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import org.springframework.stereotype.Service;

import java.awt.image.BufferedImage;
import java.io.Serializable;

/**
 * @author bailing
 * @create 2018年7月17日15:35:00
 * @desc
 **/
@TableName(value = "HomePage")
public class HomePage implements Serializable {

        @TableField(exist = false)
        private static final long serialVersionUID = 1L;

        @TableId(type = IdType.AUTO)
        private int id;//用户id
        private String foodPic;//美食图片
        private String foodTopic;//食物主题
        private String describe;//食物描述
        private String user;//用户名
        private String userPic;//用户的头像
        private int goodNum;

    public String getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(String foodPic) {
        this.foodPic = foodPic;
    }

    public String getUserPic() {
        return userPic;
    }

    public void setUserPic(String userPic) {
        this.userPic = userPic;
    }

    public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

      /*  public BufferedImage getFoodPic() {
            return foodPic;
        }

        public void setFoodPic(BufferedImage foodPic) {
            this.foodPic = foodPic;
        }*/

        public String getFoodTopic() {
            return foodTopic;
        }

        public void setFoodTopic(String foodTopic) {
            this.foodTopic = foodTopic;
        }

        public String getDescribe() {
            return describe;
        }

        public void setDescribe(String describe) {
            this.describe = describe;

        }

        public String getUser() {
            return user;
        }

        public void setUser(String user) {
            this.user = user;
        }

/*        public BufferedImage getUserPic() {
            return userPic;
        }

        public void setUserPic(BufferedImage userPic) {
            this.userPic = userPic;
        }*/

        public int getGoodNum() {
            return goodNum;
        }

        public void setGoodNum(int goodNum) {
            this.goodNum = goodNum;
        }
}


