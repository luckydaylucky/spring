package com.itheima.dao;

import com.itheima.pojo.User;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/8 9:42
 * @Version 1.0
 */
public class UserImpl implements UserInter {
    private SqlSessionFactory sqlSessionFactory;

    public UserImpl(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public User querrybyid(int id) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        User user = sqlSession.selectOne("querryone",id);
        sqlSession.close();
        return user;
    }

    @Override
    public List<User> querryUser(String name) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        List<User> list = sqlSession.selectList("querryByname",name);
        sqlSession.close();
        return list;
    }

    @Override
    public void saveUser(User user) {
        SqlSession sqlSession = sqlSessionFactory.openSession();
        sqlSession.insert("saveUser",user);
        sqlSession.commit();
        sqlSession.close();
    }
}
