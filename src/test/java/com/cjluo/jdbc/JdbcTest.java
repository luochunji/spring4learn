package com.cjluo.jdbc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author：luocj
 * @date：2018/5/28
 */
public class JdbcTest {

    @Test
    public void test(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-datasource.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        User user = new User();
        user.setName("张三");
        user.setAge(20);
        user.setSex(GenderEnum.MALE.getCode());
        userService.save(user);
    }

    @Test
    public void listTest(){
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-datasource.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        List<User> list = userService.listUsers();
        for(User user : list){
            System.out.println(user);
        }
    }
}
