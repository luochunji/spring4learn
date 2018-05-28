package com.cjluo.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.DisposableBean;

/**
 * @author：luocj
 * @date：2018/5/24
 */
public class HelloAware implements BeanFactoryAware,DisposableBean {
    private BeanFactory beanFactory;

    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public void testAware(){
        Hello hello = (Hello)beanFactory.getBean("hello");
        hello.say();
    }

    public void destroy() throws Exception {
        System.out.println("the bean was destoried...");
    }
}
