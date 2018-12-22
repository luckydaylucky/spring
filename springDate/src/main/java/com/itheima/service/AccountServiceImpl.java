package com.itheima.service;

import com.itheima.dao.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: MR.z
 * @Date: 2018/12/13 14:36
 * @Version 1.0
 */
@Service
public class AccountServiceImpl implements AccountService{
    @Autowired
    private AccountDao accountDao;


    public void tranForMoney(String outName, String inName, int moeny) {
        this.accountDao.outMoney(outName,moeny);
        this.accountDao.inMoney(inName,moeny);
    }
}
