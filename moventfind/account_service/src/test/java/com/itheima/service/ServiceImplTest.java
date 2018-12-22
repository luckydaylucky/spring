package com.itheima.service;

import org.junit.Test;

import java.sql.SQLException;

import static org.junit.Assert.*;

/**
 * @Author: MR.z
 * @Date: 2018/12/7 14:31
 * @Version 1.0
 */
public class ServiceImplTest {

    @Test
    public void tranFer() throws SQLException {
        ServiceImpl service = new ServiceImpl();
        service.tranFer("aaa","bbb",200);

    }
}