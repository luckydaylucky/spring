package com.itheima.pojo;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/8 20:36
 * @Version 1.0
 */
public class QueryVo {
    private User user;

    private List<Integer> ids;

    public List<Integer> getIds() {
        return ids;
    }

    public void setIds(List<Integer> ids) {
        this.ids = ids;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
