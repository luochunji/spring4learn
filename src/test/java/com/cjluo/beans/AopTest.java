package com.cjluo.beans;

import com.cjluo.beans.aop.BaseBean;
import com.cjluo.beans.aop.IBaseBean;
import com.cjluo.beans.aop.JBaseBean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/5/28
 */
public class AopTest {

    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-beans.xml");
        BaseBean bean = (BaseBean) ctx.getBean("baseBean");
        bean.print();
    }
    @Test
    public void test2(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-beans.xml");
        IBaseBean bean = (IBaseBean) ctx.getBean("jbaseBean");
        bean.print();
    }
    @Test
    public void test3(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("aop-beans.xml");
        MyBean bean = (MyBean) ctx.getBean("myBean");
        System.out.println(bean);
    }
}
