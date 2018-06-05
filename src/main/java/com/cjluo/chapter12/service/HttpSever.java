package com.cjluo.chapter12.service;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/6/5
 */
public class HttpSever {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("com/cjluo/chapter12/sever/spring-config.xml");
    }
}
