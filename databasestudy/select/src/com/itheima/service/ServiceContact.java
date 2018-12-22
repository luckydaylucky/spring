package com.itheima.service;

import com.itheima.domain.Conect;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/26 13:55
 * @Version 1.0
 */
public interface ServiceContact {
    public List<Conect> querryAll() throws SQLException;
}
