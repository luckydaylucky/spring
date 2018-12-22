package com.itheima.service;

import com.itheima.Dao.ContactDao;
import com.itheima.Dao.ContactDaoImpl;
import com.itheima.domain.Contact;

import java.sql.SQLException;
import java.util.List;

public class ContactServiceImpl implements ContactService {
    @Override
    public List<Contact> queryAll() throws SQLException {
        ContactDao contactDao = new ContactDaoImpl();
        List<Contact> list = contactDao.findAllContact();
        return list;
    }
}
