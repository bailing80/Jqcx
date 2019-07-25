package com.xm.xm.util;

/**
 * Created by Think on 2018/1/25.
 */
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/**
 * Http 简单封装
 *
 * @author xuyw
 * @email xyw10000@163.com
 * @date 2012-06-14
 */
public class HttpUtil {
    // 连接超时时间
    private static final int CONNECTION_TIMEOUT = 3000;
    //读取超时时间
    private static final int READ_TIMEOUT = 5000;
    // 参数编码
    private static final String ENCODE_CHARSET = "utf-8";

    /**
     * 发送HTTP_POST请求
     *
     * @see 本方法默认的连接和读取超时均为30秒
     * @param reqURL
     *            请求地址
     * @param params
     *            发送到远程主机的正文数据[a:1,b:2]
     * @return String
     */
    public static String postRequest(String reqURL, String... params) {
        StringBuilder resultData = new StringBuilder();
        URL url = null;
        try {

            url = new URL(reqURL);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection urlConn = null;
        InputStreamReader in = null;
        BufferedReader buffer = null;
        String inputLine = null;
        DataOutputStream out = null;
        if (url != null) {
            try {
                urlConn = (HttpURLConnection) url.openConnection();
                urlConn.setDoInput(true);// 设置输入流采用字节流
                urlConn.setDoOutput(true);// 设置输出流采用字节流
                urlConn.setRequestMethod("POST");
                urlConn.setUseCaches(false); // POST请求不能使用缓存
                urlConn.setInstanceFollowRedirects(true);
                urlConn.setConnectTimeout(CONNECTION_TIMEOUT);// 设置连接超时
                urlConn.setReadTimeout(READ_TIMEOUT); // 设置读取超时
                // 配置本次连接的Content-type，配置为application/x-www-form-urlencoded的
                urlConn.setRequestProperty("Content-Type",
                        "application/x-www-form-urlencoded");
                urlConn.setRequestProperty("Charset", ENCODE_CHARSET);//
                String param = sendPostParams(params);
                urlConn.setRequestProperty("Content-Length",
                        param.getBytes().length + "");//
                // urlConn.setRequestProperty("Connection", "Keep-Alive");
                // //设置长连接
                urlConn.connect();// 连接服务器发送消息
                if (!"".equals(param)) {
                    out = new DataOutputStream(urlConn.getOutputStream());
                    // 将要上传的内容写入流中
                    out.writeBytes(param);
                    // 刷新、关闭
                    out.flush();
                    out.close();

                }
                in = new InputStreamReader(urlConn.getInputStream(),
                        HttpUtil.ENCODE_CHARSET);
                buffer = new BufferedReader(in);
                if (urlConn.getResponseCode() == 200) {
                    while ((inputLine = buffer.readLine()) != null) {
                        resultData.append(inputLine);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (buffer != null) {
                        buffer.close();
                    }

                    if (in != null) {
                        in.close();
                    }

                    if (urlConn != null) {
                        urlConn.disconnect();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return resultData.toString();
    }

    /**
     * 发送HTTP_GET请求
     *
     * @see 本方法默认的连接和读取超时均为30秒
     * @param httpUrl
     *            请求地址
     * @param map
     *            发送到远程主机的正文数据[a:1,b:2]
     * @return String
     */
    public static String getRequest(String httpUrl, String... params) {
        StringBuilder resultData = new StringBuilder();
        URL url = null;
        try {

            String paramurl = sendGetParams(httpUrl, params);
            url = new URL(paramurl);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        HttpURLConnection urlConn = null;
        InputStreamReader in = null;
        BufferedReader buffer = null;
        String inputLine = null;
        if (url != null) {
            try {
                urlConn = (HttpURLConnection) url.openConnection();
                urlConn.setRequestMethod("GET");
                urlConn.setConnectTimeout(CONNECTION_TIMEOUT);
                in = new InputStreamReader(urlConn.getInputStream(),
                        HttpUtil.ENCODE_CHARSET);
                buffer = new BufferedReader(in);
                if (urlConn.getResponseCode() == 200) {
                    while ((inputLine = buffer.readLine()) != null) {
                        resultData.append(inputLine);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    if (buffer != null) {
                        buffer.close();
                    }

                    if (in != null) {
                        in.close();
                    }

                    if (urlConn != null) {
                        urlConn.disconnect();
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return resultData.toString();
    }

    /**
     * Post追加参数
     *
     * @see <code>params</code>
     * @param reqURL
     *            请求地址
     * @param params
     *            发送到远程主机的正文数据[a:1,b:2]
     * @return
     */
    private static String sendPostParams(String... params) {
        StringBuilder sbd = new StringBuilder("");
        if (params != null && params.length > 0) {
            for (int i = 0; i < params.length; i++) {
                String[] temp = params[i].split(":");
                sbd.append(temp[0]);
                sbd.append("=");
                sbd.append(urlEncode(temp[1]));
                sbd.append("&");

            }
            sbd.setLength(sbd.length() - 1);// 删掉最后一个
        }
        return sbd.toString();
    }

    /**
     * Get追加参数
     *
     * @see <code>params</code>
     * @param reqURL
     *            请求地址
     * @param params
     *            发送到远程主机的正文数据[a:1,b:2]
     * @return
     */
    private static String sendGetParams(String reqURL, String... params) {
        StringBuilder sbd = new StringBuilder(reqURL);
        if (params != null && params.length > 0) {
            if (isexist(reqURL, "?")) {// 存在?
                sbd.append("&");
            } else {
                sbd.append("?");
            }
            for (int i = 0; i < params.length; i++) {
                String[] temp = params[i].split(":");
                sbd.append(temp[0]);
                sbd.append("=");
                sbd.append(urlEncode(temp[1]));
                sbd.append("&");

            }
            sbd.setLength(sbd.length() - 1);// 删掉最后一个
        }
        return sbd.toString();
    }

    // 查找某个字符串是否存在
    private static boolean isexist(String str, String fstr) {
        return str.indexOf(fstr) == -1 ? false : true;
    }

    /**
     * 编码
     *
     * @param source
     * @return
     */
    private static String urlEncode(String source) {
        String result = source;
        try {
            result = java.net.URLEncoder
                    .encode(source, HttpUtil.ENCODE_CHARSET);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        return result;
    }
    /**
     * 小程序网络请求
     *
     * @param url,param
     * @return
     */
    public static String get(String url,String param){
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + param;
            //System.out.println(urlNameString);
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            /*for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }*/
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }
}