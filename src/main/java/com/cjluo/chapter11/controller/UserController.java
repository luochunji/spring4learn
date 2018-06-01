package com.cjluo.chapter11.controller;

import com.cjluo.chapter11.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * @author：luocj
 * @date：2018/5/31
 */
public class UserController extends AbstractController{
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> userList = new ArrayList<>();
        User user = new User();
        user.setUsername("张三");
        user.setAge(18);
        userList.add(user);
        user = new User();
        user.setUsername("李四");
        user.setAge(20);
        userList.add(user);
        return new ModelAndView("userList","users",userList);
    }
}
