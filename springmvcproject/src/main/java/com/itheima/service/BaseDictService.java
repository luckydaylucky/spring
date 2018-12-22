package com.itheima.service;

import com.itheima.pojo.BaseDice;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 6:51
 * @Version 1.0
 */
public interface BaseDictService {
//    根据类别查询数据
    List<BaseDice> queryBaseDictByTypeCode(String typecode);

}
