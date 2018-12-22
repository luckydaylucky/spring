package com.itheima.demo1;

import org.junit.Test;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 20:54
 * @Version 1.0
 */
public class TestDemoTest {

    @Test
    public void create() {
        TestDemo testDemo = new TestDemo();
        CustormService custormService = testDemo.create();
        custormService.BestUp();
    }
}