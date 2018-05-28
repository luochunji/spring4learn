package com.cjluo.beans.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @author：luocj
 * @date：2018/5/28
 */

@Aspect
public class AspectBean {

    @Pointcut("execution(* *.print(..))")
    public void pointcut(){

    }

    @Before("pointcut()")
    public void before(){
        System.out.println("before");
    }

    @After("pointcut()")
    public void after(){
        System.out.println("after");
    }

    @Around("pointcut()")
    public Object around(ProceedingJoinPoint pj){
        System.out.println("around.before");
        Object o = null;
        try {
            o = pj.proceed();
        } catch (Throwable e) {
            e.printStackTrace();
        }
        System.out.println("around.after");
        return o;
    }
}
