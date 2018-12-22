package com.itheima.demo2;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 21:33
 * @Version 1.0
 */
public class PersonServiceQqTest {
//前置通知
    @Test
    public void saveMethod() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        PersonService personService = (PersonService) context.getBean("PerService");
        personService.save();
    }
//后置通知
    @Test
    public void afterMEthod(){
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        PersonService personService = (PersonService) context.getBean("PsersonService");
        personService.delete();
    }
//    异常通知
    @Test
    public void aroundMethod(){
//        创建spring容器
        ApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
//        从容器中获取实例
        PersonService personService = (PersonService) context.getBean("PsersonService");

        personService.update();
    }
}