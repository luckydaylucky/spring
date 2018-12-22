package com.itheima.service;

import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/12/7 14:01
 * @Version 1.0
 */
public interface ServiceInter {
    public void tranFer(String from,String to,double money) throws SQLException;
}
