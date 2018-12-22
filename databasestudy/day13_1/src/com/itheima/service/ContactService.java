package com.itheima.service;

import com.itheima.domain.Contact;

import java.sql.SQLException;
import java.util.List;

public interface ContactService {
    public List<Contact> queryAll() throws SQLException;
}
