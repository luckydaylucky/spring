package com.itheima.pojo;

import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/12 23:59
 * @Version 1.0
 */
public class UserImpl extends SqlSessionDaoSupport implements UserDao {
    public User queryUserById(int id) {
        SqlSession sqlSession = super.getSqlSession();
        User user = sqlSession.selectOne("queryUserByid", id);
        return user;
    }

    public List<User> queryUserByUsername(String name) {
        SqlSession sqlSession = super.getSqlSession();
        List<User> list = sqlSession.selectList("queryUserByUsername",name);
        return list;
    }

    public void saveuser(User user) {
        SqlSession sqlSession = super.getSqlSession();
        sqlSession.insert("saveuser",user);
//        sqlSession.commit();
    }
}
