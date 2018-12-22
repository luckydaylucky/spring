package com.itheima.c;

import sun.plugin.javascript.navig.Array;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestStore {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        Class clazz = Class.forName("com.itheima.c.BookStore");
        Method method = clazz.getMethod("sellBook");

        book bookk = method.getAnnotation(book.class);
        String[] auhor = bookk.author();

        double price = bookk.price();
        String name = bookk.value();
        System.out.println("书名:"+name+",作者"+ Arrays.toString(auhor)+",价格"+price);






    }



}
