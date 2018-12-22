package com.itheima.dao;

/**
 * @Author: MR.z
 * @Date: 2018/12/13 14:30
 * @Version 1.0
 */
public interface AccountDao {
    void outMoney(String outName,int money);

    void inMoney(String inName,int money);
}
