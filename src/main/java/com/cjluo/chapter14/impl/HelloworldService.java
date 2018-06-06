package com.cjluo.chapter14.impl;

import com.cjluo.chapter14.service.IHelloworldService;
import org.springframework.stereotype.Service;

@Service
public class HelloworldService implements IHelloworldService {
    @Override
    public String sayHello() {
        return "Hello";
    }
}
