package com.itheima.demo1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 20:49
 * @Version 1.0
 */
public class TestDemo {
    public CustormService create(){
        return (CustormService) Proxy.newProxyInstance(CustormService.class.getClassLoader(),
                new Class[]{CustormService.class}, new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("BestUp".equals(method.getName())){
                            System.out.println("大胸大胸");
                        }
                        return null;
                    }
                });
    }
}
