package com.itheima.Demo3;

import org.springframework.stereotype.Service;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 21:19
 * @Version 1.0
 */
@Service
public class PserdonImpl implements PersonService {


    @Override
    public void save() {
        System.out.println("执行save");
    }

    @Override
    public void delete() {
        System.out.println("执行delete");
    }

    @Override
    public void update() {
        System.out.println("执行update");
    }

    @Override
    public void query() {
        System.out.println("执行query");

    }

    @Override
    public void batch() {
        System.out.println("执行batch");
    }

}
