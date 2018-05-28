package com.cjluo.beans;

import org.junit.Test;
import org.springframework.beans.factory.BeanCurrentlyInCreationException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/5/22
 */
public class CycleBeanTest {

    @Test
    public void test() throws Throwable{
        try{
            new ClassPathXmlApplicationContext("text-beans.xml");
        }catch (Exception e){
            Throwable e1 = e.getCause().getCause();
            throw e1;
        }
    }

}
