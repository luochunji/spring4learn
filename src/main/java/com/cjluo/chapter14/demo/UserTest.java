package com.cjluo.chapter14.demo;

import com.cjluo.chapter14.service.IUserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/cjluo/chapter14/spring-config.xml");
        IUserService userService = (IUserService) context.getBean("userService");
        userService.getUser("Tom");

    }
}
