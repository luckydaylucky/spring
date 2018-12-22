package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Author: MR.z
 * @Date: 2018/12/8 10:07
 * @Version 1.0
 */
public class UserImplTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void querrybyid() {
        UserInter userInter = new UserImpl(this.sqlSessionFactory);
        User user = userInter.querrybyid(1);
        System.out.println(user);
    }

    @Test
    public void querryUser() {
        UserInter userInter = new UserImpl(this.sqlSessionFactory);
        List<User> list = userInter.querryUser("%王%");
        for(User user : list){
            System.out.println(user);
        }
    }

    @Test
    public void saveUser() {
        UserInter userInter = new UserImpl(this.sqlSessionFactory);
        User user = new User();
        user.setUsername("刘备");
        user.setBirthday(new Date());
        user.setSex("男");
        user.setAdress("北京");
        userInter.saveUser(user);
    }
}