package com.xm.xmap1702044.model;

import java.io.Serializable;

/**
 * Token的Model类，可以增加字段提高安全性，例如时间戳、url签名
 */
public class TokenModel implements Serializable {

    private static final long serialVersionUID = 1L;

    //用户id
    private String userId;

    //随机生成的uuid
    private String token;

    //时间
    private Long timeStamp;

    //设备编号
    private String appid;

    private String loginName;

    private int type;


    public TokenModel(String userId, String token, String appid, String loginName, int type) {
        this.userId = userId;
        this.token = userId+"_"+token+"_"+appid+"_"+loginName+"_"+type;
        this.appid = appid;
        this.loginName = loginName;
        this.type = type;
    }

    public TokenModel(String userId, String token, String appid, String loginName) {
        this.userId = userId;
        this.token = userId+"_"+token+"_"+appid+"_"+loginName;
        this.appid = appid;
        this.loginName = loginName;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }
}
