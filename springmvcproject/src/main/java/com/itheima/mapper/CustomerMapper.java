package com.itheima.mapper;

import com.itheima.pojo.Customer;
import com.itheima.pojo.QueryVo;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 12:01
 * @Version 1.0
 */
public interface CustomerMapper {

    int queryCountByQueryVo(QueryVo queryVo);

    List<Customer> queryCustomerByQueryVo(QueryVo queryVo);
}
