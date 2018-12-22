package com.itheima.Demo3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 21:21
 * @Version 1.0
 */
@Component
@Aspect
public class PersonServiceQq {

    @Before("execution(* save(..))")
    public void saveMethod(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature().getDeclaringType());
        System.out.println(joinPoint.getSignature().getDeclaringTypeName());
        System.out.println("执行之前校验");
    }

}
