package com.itheima.app;

import com.itheima.service.AccountService;

public class AccountApp {
    public static void main(String[] args) {
        AccountService service = new AccountService();
        int flag = service.transfer("jack","rose",1000);
        if(flag == 1){
            System.out.println("转账成功");
        }else {
            System.out.println("转账失败");
        }
    }
}
