package com.test.demo.model;

import com.baomidou.mybatisplus.annotations.IdType;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;

/**
 * @author xuzhiyuan
 * @create 2018年7月17日16:37:47
 * @desc
 **/
@TableName(value = "foodency")

public class FoodEncy implements Serializable {
    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.AUTO)
    private int id;//主键ID
    private String name; //名称
    private String hotLife;//热量
    private String foodPic;//图片
    private String type; //类型

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHotLife() {
        return hotLife;
    }

    public void setHotLife(String hotLife) {
        this.hotLife = hotLife;
    }

    public String getFoodPic() {
        return foodPic;
    }

    public void setFoodPic(String foodPic) {
        this.foodPic = foodPic;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}