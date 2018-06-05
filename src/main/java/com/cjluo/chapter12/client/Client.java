package com.cjluo.chapter12.client;

import com.cjluo.chapter12.service.IHelloRMIService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/6/5
 */
public class Client {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cjluo/chapter12/client/spring-config.xml");
        IHelloRMIService service = context.getBean("myClient",IHelloRMIService.class);
        System.out.println(service.add(1,2));
    }
}
