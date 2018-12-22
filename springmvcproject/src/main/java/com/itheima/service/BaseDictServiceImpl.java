package com.itheima.service;

import com.itheima.mapper.BaseDictMapper;
import com.itheima.pojo.BaseDice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 7:10
 * @Version 1.0
 */
@Service
public class BaseDictServiceImpl implements BaseDictService {
    @Autowired
    private BaseDictMapper baseDictMapper;

    public List<BaseDice> queryBaseDictByTypeCode(String typecode) {
        List<BaseDice> list = baseDictMapper.queryBaseDictByTypeCode(typecode);
        return list;

    }
}
