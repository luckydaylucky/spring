package com.itheima.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author: MR.z
 * @Date: 2018/12/13 14:45
 * @Version 1.0
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:beans.xml")
public class AccountServiceImplTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void tranForMoney() {
        this.accountService.tranForMoney("李四","王五",100);
    }
}