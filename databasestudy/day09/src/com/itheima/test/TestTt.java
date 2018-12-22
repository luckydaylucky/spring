package com.itheima.test;

import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestTt {
    @Test
    public void test() throws IOException {

        Class clazz = TestTt.class;

        ClassLoader classLoader = clazz.getClassLoader();
        InputStream in = classLoader.getResourceAsStream("db.properties");
        Properties properties = new Properties();

        properties.load(in);
//        System.out.println(properties);

        String driver = properties.getProperty("driver");
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");


        System.out.println("driver="+driver+",username="+username+",password="+password);
    }

    @Test
    public void test03() throws IOException {
        Class clazz = peron.class;

        String name = clazz.getName();

        System.out.println(name);

        String getsim = clazz.getSimpleName();
        System.out.println(getsim);

    }

    @Test
    public void test04() throws IOException, ClassNotFoundException, IllegalAccessException, InstantiationException {

        Class clazz = Class.forName("com.itheima.test.peron");

        peron p = (peron) clazz.newInstance();
        p.peronEat();


    }
}
