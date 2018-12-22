package com.itheima.b;

import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;


/*
*
* @author
* */

public class RefelTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Class clazz = RefelTest.class;

        ClassLoader classLoader = clazz.getClassLoader();
        InputStream in = classLoader.getResourceAsStream("person.properties");

        Properties properties = new Properties();
        properties.load(in);

        String classname = properties.getProperty("classname");
        String methodname = properties.getProperty("methodnamee");

        Class clazz2 = Class.forName(classname);

        Method methodism1 = clazz2.getMethod(methodname);
        methodism1.setAccessible(true);
        methodism1.invoke(clazz2.newInstance());



    }
}
