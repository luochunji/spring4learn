package com.cjluo.chapter14.impl;

import com.cjluo.chapter14.service.IHelloworldService;
import com.cjluo.chapter14.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    private IHelloworldService helloworldService;


    @Override
    public void getUser(String name) {
        System.out.println(name +","+ helloworldService.sayHello());
    }
}
