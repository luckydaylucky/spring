package com.itheima.pojo;

import org.junit.Test;

/**
 * @Author: MR.z
 * @Date: 2018/12/11 20:41
 * @Version 1.0
 */
public class CustormTest {

    @Test
    public void create() {
        Custorm custorm = new Custorm();
        customService customService = custorm.create();
        customService.hello();
    }
}