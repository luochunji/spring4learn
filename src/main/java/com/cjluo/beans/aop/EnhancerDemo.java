package com.cjluo.beans.aop;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author：luocj
 * @date：2018/5/28
 */
public class EnhancerDemo {

    public void test(){
        System.out.println("test...");
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(EnhancerDemo.class);
        enhancer.setCallback(new MethodInterceptorImpl());

        EnhancerDemo demo = (EnhancerDemo) enhancer.create();
        demo.test();
        System.out.println(demo);
    }

    private static class MethodInterceptorImpl implements MethodInterceptor {

        public Object intercept(Object o, Method method, Object[] args, MethodProxy proxy) throws Throwable {
            System.out.println("Before invoke:" + method);
            Object result = proxy.invokeSuper(o, args);
            System.out.println("After invoke:" + method);
            return result;
        }
    }
}
