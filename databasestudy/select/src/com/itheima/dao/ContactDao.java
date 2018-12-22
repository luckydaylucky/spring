package com.itheima.dao;

import com.itheima.domain.Conect;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/26 13:40
 * @Version 1.0
 */
public interface ContactDao {
    public List<Conect> findAll() throws SQLException;
}
