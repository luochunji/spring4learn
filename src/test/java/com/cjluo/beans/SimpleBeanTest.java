package com.cjluo.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/5/25
 */
public class SimpleBeanTest {

    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        SimpleBean simpleBean = (SimpleBean) ctx.getBean("simpleBean");
        System.out.println(simpleBean);
    }
}
