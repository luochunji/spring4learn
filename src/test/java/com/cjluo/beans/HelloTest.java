package com.cjluo.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/5/24
 */
public class HelloTest {

    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        HelloAware helloAware = (HelloAware) ctx.getBean("helloAware");
        helloAware.testAware();
    }
}
