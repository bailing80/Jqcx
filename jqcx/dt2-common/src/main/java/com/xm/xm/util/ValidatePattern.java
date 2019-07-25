package com.xm.xm.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by F on 2017/5/4.
 */
public class ValidatePattern {

    public static boolean isMobileNO(String mobiles){
        ///^(((0\d{2,3}-?)?\d{7,8})|(1(3|4|5|7|8)\d{9}))$/
        Pattern p = Pattern.compile("^(1(3|4|5|7|8)\\d{9})$");
        // Pattern p = Pattern.compile("^((1[0-9])|(1[^4,\\D])|(1[0,5-9]))\\d{9}$");
        Matcher m = p.matcher(mobiles);
     return m.matches();
    }

}
