package com.cjluo.chapter10;

import com.cjluo.chapter10.bean.User;
import com.cjluo.chapter10.mapper.IUserService;
import com.cjluo.chapter9.mapper.IUserMapper;
import com.cjluo.jdbc.GenderEnum;
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
        ApplicationContext ctx = new ClassPathXmlApplicationContext("com/cjluo/chapter10/config/spring-config.xml");
        IUserService userService = (IUserService) ctx.getBean("userService");
        User user = new User();
        user.setName("李四");
        user.setAge(18);
        user.setSex(GenderEnum.FEMALE.getCode());
        userService.save(user);
    }

}
