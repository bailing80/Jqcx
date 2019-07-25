package com.xm.xmap1702044.startup;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by FF on 2017/5/1.
 */
public class StartupService {

    static Logger logger = LoggerFactory.getLogger(StartupService.class);

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"spring/application-context.xml"});
        context.start();
        logger.info("★★★★★★dubbo-provider服务启动成功★★★★★★");
        System.out.println("★★★★★★dubbo-provider服务启动成功★★★★★★");
        synchronized (StartupService.class)
        {
            while (true)
                try
                {
                    StartupService.class.wait();
                }
                catch (Throwable e) {
                    e.printStackTrace();
                }
        }

    }

}
