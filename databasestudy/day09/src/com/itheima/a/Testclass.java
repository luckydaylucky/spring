package com.itheima.a;

import com.itheima.test.peron;
import org.junit.Test;

public class Testclass {

    @Test
    public void test() throws ClassNotFoundException {

//        获取class字节码文件对象

        Class clazz = peron.class;



        peron p = new peron();
        Class clazz01 = p.getClass();

        Class clazz02  = Class.forName("com.itheima.test.peron");

        System.out.println(clazz == clazz01);
        System.out.println(clazz02 == clazz01);




    }

}
