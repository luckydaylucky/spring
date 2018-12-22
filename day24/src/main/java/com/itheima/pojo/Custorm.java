package com.itheima.pojo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 20:37
 * @Version 1.0
 */
public class Custorm {
    public customService create(){
        return (customService) Proxy.newProxyInstance(customService.class.getClassLoader(),
                new Class[]{customService.class}, new InvocationHandler() {
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        if("hello".equals(method.getName())){
                            System.out.println("增强了hello方法");
                        }
                        return null;
                    }
                });
    }
}
