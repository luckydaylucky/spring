package com.itheima.mapper;

import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
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
 * @Date: 2018/12/8 11:09
 * @Version 1.0
 */
public class UserMapperTest {
    private SqlSessionFactory sqlSessionFactory;
    @Before
    public void init() throws IOException {
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");
        this.sqlSessionFactory = sqlSessionFactoryBuilder.build(inputStream);
    }

    @Test
    public void querryone() {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = userMapper.querryone(1);
        System.out.println(user);
        sqlSession.close();
    }

    @Test
    public void querryByname() {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        List<User> list = userMapper.querryByname("李");
        for(User user : list){
            System.out.println(user);
        }
        sqlSession.close();
    }

    @Test
    public void saveUser() {
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user = new User();
        user.setUsername("张柏芝");
        user.setBirthday(new Date());
        user.setSex("女");
        user.setAdress("南京");
        userMapper.saveUser(user);
        System.out.println(user);
        sqlSession.commit();
        sqlSession.close();
    }
}