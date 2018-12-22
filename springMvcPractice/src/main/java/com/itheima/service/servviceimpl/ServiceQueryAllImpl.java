package com.itheima.service.servviceimpl;

import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import com.itheima.service.serviceQueryALl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/19 9:59
 * @Version 1.0
 */
@Service
public class ServiceQueryAllImpl implements serviceQueryALl {

    @Autowired
    private ItemMapper itemMapper;

    public List<Item> queryAllService() {
        List<Item> list = itemMapper.queryALll();
        return list;
    }
}
