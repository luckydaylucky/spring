package com.itheima.test;

import com.itheima.domain.user;
import org.junit.Test;

import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;


public class ConstructorTest {

//    contructor返回无参构造
    @Test
    public void ContructorTest() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class clazz = Class.forName("com.itheima.domain.user");

        Constructor con = clazz.getConstructor();


        user uu = (user) con.newInstance();


        System.out.println(uu);

    }


    @Test
    public void conDemo1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class Clazz = Class.forName("com.itheima.domain.user");

        Constructor con = Clazz.getConstructor(String.class,int.class);

        user uu = (user) con.newInstance("小王",18);//创建对象

        System.out.println(uu);



    }


    @Test
    public void conTest3() throws ClassNotFoundException {

        Class Clazz = Class.forName("com.itheima.domain.user");
//获取所有构造方法
        Constructor[] con = Clazz.getConstructors();

        System.out.println(Arrays.toString(con));



    }
    @Test
    public void conTest4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class Clazz = Class.forName("com.itheima.domain.user");
//        创建对象
        Constructor con = Clazz.getDeclaredConstructor(String.class,int.class);


//        去除私有权限
        con.setAccessible(true);
        user o = (user) con.newInstance("小王",62);
        System.out.println(o);

    }
}
