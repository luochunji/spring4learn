package com.cjluo.beans;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.GregorianCalendar;
import java.util.Locale;

/**
 * @author：luocj
 * @date：2018/5/25
 */
public class I18nTest {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        Object[] params = {"James", new GregorianCalendar().getTime()};
        System.out.println(ctx.getMessage("test", params, Locale.US));
        System.out.println(ctx.getMessage("test", params, Locale.CHINA));
    }
}
