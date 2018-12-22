package com.itheima.demo2;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 21:21
 * @Version 1.0
 */
public class PersonServiceQq {
    public void saveMethod(){
        System.out.println("执行之前校验");
    }

    public void afterMethod(){
        System.out.println("我是后置通知");
    }

    public void execeptionPar(){
        System.out.println("我是异常通知");
    }

    public void endPar(){
        System.out.println("我是最终通知");
    }

    public void aroundMethod(){
        System.out.println("我是环绕通知");
    }
}
