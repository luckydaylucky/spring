package com.itheima.test;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class MthodTest {
    @Test
    public void Method1() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName("com.itheima.domain.user");

        Method methodm = clazz.getMethod("sleep");
        methodm.invoke(clazz.newInstance());


    }

    @Test
    public void Method2() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName("com.itheima.domain.user");

        Method eatt = clazz.getMethod("eat", String.class, String.class);
        eatt.invoke(clazz.newInstance(),"小王","红烧肉");


    }

    @Test
    public void Method3() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName("com.itheima.domain.user");

       Method[] med = clazz.getMethods();
       System.out.println(Arrays.toString(med));


    }

    @Test
    public void Method4() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = Class.forName("com.itheima.domain.user");

        Method wcme = clazz.getDeclaredMethod("goWc");
        wcme.setAccessible(true);
        wcme.invoke(clazz.newInstance());




    }






}
