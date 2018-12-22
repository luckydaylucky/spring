package com.itheima.pojo;

import java.util.Arrays;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/16 19:37
 * @Version 1.0
 */
public class QueryVo {
    private Item item;

    private Integer[] ids;

    private List<Item> itemList;

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    public Integer[] getIds() {
        return ids;
    }

    public void setIds(Integer[] ids) {
        this.ids = ids;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "QueryVo{" +
                "item=" + item +
                ", ids=" + Arrays.toString(ids) +
                '}';
    }
}
