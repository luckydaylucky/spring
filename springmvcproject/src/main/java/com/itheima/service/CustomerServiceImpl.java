package com.itheima.service;

import com.itheima.mapper.CustomerMapper;
import com.itheima.pojo.Customer;
import com.itheima.pojo.QueryVo;
import com.itheima.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 11:59
 * @Version 1.0
 */
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerMapper customerMapper;

    public Page<Customer> queryCustomerByQueryVo(QueryVo queryVo) {
        queryVo.setStrart((queryVo.getPage() - 1) * queryVo.getSize());
//        对查询条件queryvo进行处理

//        查询总条数
        int total = customerMapper.queryCountByQueryVo(queryVo);
//        查询客户数据结果集
        List<Customer> list = customerMapper.queryCustomerByQueryVo(queryVo);
//       封装返回对象page
        Page<Customer> page = new Page<Customer>(total,queryVo.getPage(),queryVo.getSize(),list);
        return page;
    }
}
