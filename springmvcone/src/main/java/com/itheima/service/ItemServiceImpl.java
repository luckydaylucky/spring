package com.itheima.service;

import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/15 7:06
 * @Version 1.0
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    public List<Item> queryService() {
        List<Item> list = itemMapper.queryall();
        return list;
    }

    public Item queryByid(int id) {
        Item item = itemMapper.queryByid(id);
        return item;
    }

    public void updateByid(Item item) {
        itemMapper.updateByid(item);
    }
}
