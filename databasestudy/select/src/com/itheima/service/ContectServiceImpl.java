package com.itheima.service;

import com.itheima.dao.ContactDao;
import com.itheima.dao.ContactDaoImpl;
import com.itheima.domain.Conect;

import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/26 13:57
 * @Version 1.0
 */
public class ContectServiceImpl implements ServiceContact {
    @Override
    public List<Conect> querryAll() throws SQLException {
        ContactDao contactDao = new ContactDaoImpl();
        List<Conect> list = contactDao.findAll();
        return list;
    }
}
