package org.example.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class MyAdvice {

    @Pointcut("execution(* org..select())")
    private void pt() {}

    //@Before("pt()")
    public void method() {
        System.out.println(System.currentTimeMillis());
    }

    //@Before("pt()")
    public void before() {
        System.out.println("before advice");
    }

    //@After("pt()")
    public void after() {
        System.out.println("after advice");
    }

    //@Around("pt()")
    public Object around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around before");
        Object obj = proceedingJoinPoint.proceed();
        System.out.println("around after");
        return obj;
    }

    //@AfterReturning("pt()")
    public void afterReturn() {
        System.out.println("after returning");
    }

    @AfterThrowing("pt()")
    public void afterThrowing() {
        System.out.println("after throwing exception");
    }
}
