package com.xm.xmap1702044.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2017/5/1.
 */
public class StartupConstumer {

    static Logger logger = LoggerFactory.getLogger(StartupConstumer.class);

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring-config.xml"});
        context.start();
        logger.info("★★★★★★dubbo-constumer服务启动成功★★★★★★");
        System.out.println("★★★★★★dubbo-constumer服务启动成功★★★★★★");
        synchronized (StartupConstumer.class)
        {
            while (true)
                try
                {
                    StartupConstumer.class.wait();
                }
                catch (Throwable e) {
                    e.printStackTrace();
                }
        }

    }

}
