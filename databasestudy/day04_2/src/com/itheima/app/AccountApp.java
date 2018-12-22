package com.itheima.app;

import com.itheima.serverce.AccountService;

import java.sql.SQLException;

public class AccountApp {
    public static void main(String[] args) throws SQLException {
        AccountService service = new AccountService();

        int flag = service.transfer("jack","rose",1000.00);
        if(flag == 1){
            System.out.println("转账成功");

        }else{
            System.out.println("转账失败交易结束");
        }
    }



}
