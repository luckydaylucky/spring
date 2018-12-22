package com.itheima.test;

import com.itheima.domain.user;
import org.junit.Test;

import java.lang.reflect.Field;

public class FileDmo {
    @Test
    public void File() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        Class clazz = Class.forName("com.itheima.domain.user");

        Field fill = clazz.getField("name");
        clazz.getField("age");
        user u = new user();
        fill.set(u,"张三");
        System.out.println(u);

    }
}
