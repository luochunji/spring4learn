package com.cjluo.chapter9;

import com.cjluo.chapter9.mapper.IUserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author：luocj
 * @date：2018/5/29
 */
public class UserServiceTest {

    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cjluo/chapter9/config/spring-config.xml");
        IUserMapper userMapper = (IUserMapper) ctx.getBean("IUserMapper");
        System.out.println(userMapper.getUser(3));
    }

}
