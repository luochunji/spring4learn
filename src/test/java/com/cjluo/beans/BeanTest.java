package com.cjluo.beans;

import com.cjluo.beans.convert.String2DateConverter;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.core.io.ClassPathResource;

/**
 * @author：luocj
 * @date：2018/5/15
 */
public class BeanTest {

    @Test
    public void testMyBean(){
//        DefaultConversionService conversionService = new DefaultConversionService();
//        conversionService.addConverter(new String2DateConverter());

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        MyBean myBean = (MyBean) ctx.getBean("myBean");
        System.out.println(myBean.getDate());

    }

    @Test
    public void test(){
        System.out.println(Math.abs(Integer.MIN_VALUE));
        System.out.println(Integer.MAX_VALUE);
    }
}
