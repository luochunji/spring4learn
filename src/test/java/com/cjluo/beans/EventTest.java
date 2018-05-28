package com.cjluo.beans;

import com.cjluo.beans.event.EventBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/5/25
 */
public class EventTest {

    @Test
    public void test() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-beans.xml");
        EventBean event = new EventBean("hello", "msg");
        ctx.publishEvent(event);
    }
}
