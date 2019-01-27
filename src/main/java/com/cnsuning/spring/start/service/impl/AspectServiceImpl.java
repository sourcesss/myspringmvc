package com.cnsuning.spring.start.service.impl;

import com.alibaba.fastjson.JSON;
import com.cnsuning.spring.start.aspect.MyAspect;
import com.cnsuning.spring.start.service.inf.AspectService;
import com.sun.javafx.binding.StringFormatter;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component("aspectService")
@Aspect
public class AspectServiceImpl implements AspectService {

    @Pointcut("execution(* com.cnsuning.spring.start.service.impl.*.*(..)) && @annotation(myAspect)")
    public void hello(MyAspect myAspect){

    }
    @Override
    @After("hello(myAspect)")
    public void after(JoinPoint joinPoint,MyAspect myAspect) {
        System.out.println("切点返回后展示");
        System.out.println(myAspect.value());
    }

    @Override
    @AfterReturning(value = "hello(myAspect)",returning = "result")
    public Object afterReturning(JoinPoint joinPoint,MyAspect myAspect,Object result) {
        System.out.println(StringFormatter.format("切点返回后展示，我们拿到了返回值：%s",JSON.toJSONString(result)).getValue());
        System.out.println(myAspect.value());
        return result;
    }

}
