package com.itheima.mapper;

import com.itheima.pojo.QueryVo;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Test
    public void testQueryVo(){
        SqlSession sqlSession = this.sqlSessionFactory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        QueryVo queryVo = new QueryVo();
        User user = new User();
        user.setUsername("张");
        queryVo.setUser(user);

        List<User> users = userMapper.querryByUser(queryVo);
        for(User user1 : users){
            System.out.println(user1);
        }
        sqlSession.close();
    }

    @Test
    public void testCount(){
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        int Count = userMapper.queryCount();
        System.out.println(Count);
        sqlSession.close();
    }

    @Test
    public void testQuerySex(){
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        User user = new User();
        user.setUsername("%张%");
        user.setSex("1");
        List<User> list = userMapper.queryUserSex(user);
        for(User user1 : list){
            System.out.println(user1);
        }
        sqlSession.close();
    }

    @Test
    public void testQueryIds(){
        SqlSession sqlSession = this.sqlSessionFactory.openSession();
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        QueryVo queryVo = new QueryVo();
        List<Integer> ids = new ArrayList<Integer>();
        ids.add(6);
        ids.add(8);
        ids.add(7);
        queryVo.setIds(ids);

        List<User> list = userMapper.queryByIds(queryVo);
        for(User u : list){
            System.out.println(u);
        }
    }
}