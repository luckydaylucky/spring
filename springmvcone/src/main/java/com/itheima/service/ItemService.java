package com.itheima.service;

import com.itheima.pojo.Item;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/15 7:04
 * @Version 1.0
 */

public interface ItemService {
    public List<Item> queryService();


    Item queryByid(int id);

    void updateByid(Item item);

}
