package com.xm.xmap1702044.service.impl;

import com.xm.xmap1702044.model.TokenModel;
import com.xm.xmap1702044.service.TokenManager;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 通过Redis存储和验证token的实现类
 * @see
 */
@Component(value = "manager")
public class RedisTokenManager implements TokenManager {
    @Override
    public TokenModel createToken(String userId, String appid, String LoginName) {
        //使用uuid作为源token
        String token =  UUID.randomUUID().toString().replace("-", "");
        TokenModel model = new TokenModel(userId, token,appid,LoginName);
        //存储到redis并设置过期时间
        return model;
    }

    @Override
    public TokenModel createToken(String userId, String appid, String LoginName, int type) {
        //使用uuid作为源token
        String token =  UUID.randomUUID().toString().replace("-", "");
        TokenModel model = new TokenModel(userId, token,appid,LoginName,type);
        //存储到redis并设置过期时间

        return model;
    }

    @Override
    public boolean checkToken(TokenModel model) {
        if (model == null) {
            return false;
        }
        return true;
    }

    @Override
    public TokenModel getToken(String authentication) {
        if (authentication == null || authentication.length() == 0) {
            return null;
        }
        String[] param = authentication.split("_");
        if (param.length < 4) {
            return null;
        }
        //使用userId和源token简单拼接成的token，可以增加加密措施
        String userId =param[0];
        String token = param[1];
        String appid = param[2];
        String loginName =  param[3];
        if(param.length == 5) {
            return new TokenModel(userId, token, appid,loginName,Integer.valueOf(param[4]));
        } else {
            return new TokenModel(userId, token, appid,loginName);
        }
    }

    @Override
    public void deleteToken(long userId) {

    }
}
