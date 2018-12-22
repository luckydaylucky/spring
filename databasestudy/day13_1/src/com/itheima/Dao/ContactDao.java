package com.itheima.Dao;

import com.itheima.domain.Contact;

import java.sql.SQLException;
import java.util.List;

public interface ContactDao {
    public List<Contact> findAllContact() throws SQLException;
}
