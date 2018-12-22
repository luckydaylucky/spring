package com.itheima.demo2;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 21:19
 * @Version 1.0
 */
public class PserdonImpl implements PersonService {
    public void save() {
        System.out.println("执行save");
    }

    public void delete() {
        System.out.println("执行delete");

    }

    public void update() {

        System.out.println("执行更新");
        int a = 1/0;

    }

    public void query() {
        System.out.println("执行查询");

    }

    public void batch() {
        System.out.println("执行batch");

    }
}
