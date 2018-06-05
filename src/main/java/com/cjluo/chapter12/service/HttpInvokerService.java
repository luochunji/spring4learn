package com.cjluo.chapter12.service;

/**
 * @author：luocj
 * @date：2018/6/5
 */
public class HttpInvokerService implements IHttpInvokerService {
    @Override
    public String sayHello(String name) {
        return "Hello,"+name;
    }
}
