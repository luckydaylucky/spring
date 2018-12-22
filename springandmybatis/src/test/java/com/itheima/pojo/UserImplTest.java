package com.itheima.pojo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/13 20:14
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class UserImplTest {
    @Autowired
    private UserDao userDao;
    @Test
    public void queryUserById() {
        User user = userDao.queryUserById(1);
        System.out.println(user);
    }

    @Test
    public void queryUserByUsername() {
        List<User> list = userDao.queryUserByUsername("%王%");
        for(User user : list){
            System.out.println(user);
        }
    }

    @Test
    public void saveuser() {
        User user = new User();
        user.setUsername("张三");
        user.setBirthday(new Date());
        user.setAddress("北京");
        userDao.saveuser(user);

    }
}