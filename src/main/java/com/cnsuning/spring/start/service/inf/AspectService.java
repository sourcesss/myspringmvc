package com.cnsuning.spring.start.service.inf;

import com.cnsuning.spring.start.aspect.MyAspect;
import org.aspectj.lang.JoinPoint;

public interface AspectService {

    void after(JoinPoint joinPoint, MyAspect myAspect);

    Object afterReturning(JoinPoint joinPoint,MyAspect myAspect,Object result);

}
