package com.xm.xm.util;

/**
 * 一些常量
 */
public class SysConst {

	/**
	 * 存储当前登录用户id的字段名
	 */
	public static final String CURRENT_USER_ID = "CURRENT_USER_ID";

	/**
	 * 存储当前登录用户其他信息字段
	 */
	public static final String CURRENT_USER = "CURRENT_USER";

	/**
	 * 存储当前登录用户id的字段名
	 */
	public static final String APPID = "APP_ID";

	/**
	 * token有效期（小时）
	 */
	public static final int TOKEN_EXPIRES_HOUR = 72;

	/**
	 * token有效期（小时）
	 */
	public static final int TOKEN_EXPIRES_DAY = 14;

	/**
	 * 存放Authorization的header字段
	 */
	public static final String AUTHORIZATION = "authorization";


	public static final String CLIENT_APP_ID = "client-app-id";

	public static final Integer OPERATION_TIME = 5;	//一些更新操作动作默认缓存的秒数,用于防止重复提交



	public static String CUSTOMER_APP_ID = "";


	public static String DRIVER_APP_ID = "";
	
	public static String BAIDU_GEOCONV_KEY = "MqsqLfL2u111pxOpGUsVMt8GdCAfQ71z";
	/**
	 * 排序方式
	 * @author Administrator
	 *
	 */
	public enum SortBy{
		ASC,DESC;
	}
}
