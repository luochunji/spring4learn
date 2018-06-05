package com.cjluo.chapter12.client;

import com.cjluo.chapter12.service.IHttpInvokerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/6/5
 */
public class HttpInvokerClient {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cjluo/chapter12/client/spring-config.xml");
        IHttpInvokerService service = (IHttpInvokerService) context.getBean("remoteService");
        System.out.println(service.sayHello("Tom"));
    }
}
