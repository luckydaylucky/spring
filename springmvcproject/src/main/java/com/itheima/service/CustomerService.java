package com.itheima.service;

import com.itheima.pojo.Customer;
import com.itheima.pojo.QueryVo;
import com.itheima.utils.Page;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 11:42
 * @Version 1.0
 */
public interface CustomerService {
    Page<Customer> queryCustomerByQueryVo(QueryVo queryVo);
}
