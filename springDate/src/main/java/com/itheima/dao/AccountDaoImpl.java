package com.itheima.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author: MR.z
 * @Date: 2018/12/13 14:31
 * @Version 1.0
 */
@Repository
public class AccountDaoImpl implements AccountDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void outMoney(String outName,int money) {
        this.jdbcTemplate.update("update counnts set money = money - ? where `username` = ?",money,outName);
    }

    public void inMoney(String inName,int money) {
        this.jdbcTemplate.update("update counnts set money = money + ? where `username` = ?",money,inName);

    }
}
