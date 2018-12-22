package com.itheima.mapper;

import com.itheima.pojo.BaseDice;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 6:52
 * @Version 1.0
 */
public interface BaseDictMapper {

    List<BaseDice> queryBaseDictByTypeCode(String typecode);
}
