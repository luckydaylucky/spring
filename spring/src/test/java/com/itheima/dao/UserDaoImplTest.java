package com.itheima.dao;

import com.itheima.demo2.Dog;
import com.itheima.demo2.User;
import com.itheima.demo5.ConnectProty;
import com.itheima.demo6.Item;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import java.util.List;
import java.util.Map;

/**
 * @Author: MR.z
 * @Date: 2018/12/9 20:01
 * @Version 1.0
 */
public class UserDaoImplTest {
    @Test
    public void testSprin(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sping.xml");
        UserDaoImpl userDao = (UserDaoImpl) applicationContext.getBean("userDao");
        userDao.hello();

        System.out.println(userDao.getUsername());
    }

    @Test
    public void testDemo2(){
        FileSystemXmlApplicationContext fsxapc = new FileSystemXmlApplicationContext("E:\\javaee\\spring\\src\\main\\resources\\sping.xml");
        UserDaoImpl userDao = (UserDaoImpl) fsxapc.getBean("userDao");
        userDao.hello();
        System.out.println(userDao.getUsername());
    }

    @Test
    public void testBean(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sping.xml");
        UserBean userBean = (UserBean) applicationContext.getBean("bean1");
        userBean.bean();
    }

    @Test
    public void testBean2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sping.xml");
        UserBean2 userBean2 = (UserBean2) applicationContext.getBean("userBean2");
        userBean2.UserBean();
    }

    @Test
    public void testBean3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("sping.xml");
        UserBean3 userBean3 = (UserBean3) applicationContext.getBean("userBean3");
        userBean3.userBeanT();
    }
//自定义赋值
    @Test
    public void testSetValue(){
        ClassPathXmlApplicationContext cpac = new ClassPathXmlApplicationContext("sping.xml");
        User user = (User) cpac.getBean("user");
        System.out.println(user);
    }

    @Test
    public void DogTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sping.xml");
        User user = (User) context.getBean("userDog");
        Dog dog = user.getDog();
        System.out.println(dog);
        System.out.println(user);
    }
//list集合遍历测试
    @Test
    public void listTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sping.xml");
        ConnectProty connectProty = (ConnectProty) context.getBean("connectProty");
        List list = connectProty.getList();
        for (Object o : list){
            System.out.println(o);
        }
    }
//map集合遍历
    @Test
    public void mapTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sping.xml");
        ConnectProty connectProty = (ConnectProty) context.getBean("connectProty");
        Map<Object,Object> map = connectProty.getMap();
        for(Map.Entry<Object,Object> entry : map.entrySet()){
            System.out.println(entry.getKey().toString() + ":::" + entry.getValue().toString());
        }
    }

    @Test
    public void propert(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("sping.xml");
        ConnectProty connectProty = (ConnectProty) context.getBean("connectProty");
        System.out.println(connectProty.getProperties());
    }

    @Test
    public void annoTest(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring2.xml");
        Item item = (Item) context.getBean("item");
        item.test();
        item.toString();
        System.out.println(item);

    }


    @Test
    public void getUsername() {
    }

    @Test
    public void setUsername() {
    }

    @Test
    public void hello() {
    }
}