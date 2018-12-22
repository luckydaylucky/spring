package com.itheima.Demo3;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author: MR.z
 * @Date: 2018/12/12 11:16
 * @Version 1.0
 */
public class PersonServiceQqTest {

    @Test
    public void saveMethod() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
        PersonService bean = context.getBean(PersonService.class);
        bean.save();
    }
}