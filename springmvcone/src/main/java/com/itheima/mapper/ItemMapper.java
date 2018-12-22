package com.itheima.mapper;

import com.itheima.pojo.Item;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/15 0:53
 * @Version 1.0
 */
public interface ItemMapper {
    public List<Item> queryall();

    Item queryByid(int id);

    void updateByid(Item item);

}
