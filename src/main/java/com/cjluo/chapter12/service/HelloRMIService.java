package com.cjluo.chapter12.service;

/**
 * @author：luocj
 * @date：2018/6/5
 */
public class HelloRMIService implements IHelloRMIService {
    @Override
    public int add(int a, int b) {
        System.out.println("add method");
        return a + b;
    }
}
