package com.itheima.controller;

import com.itheima.mapper.ItemMapper;
import com.itheima.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/19 10:04
 * @Version 1.0
 */
@Controller
public class ItemController {
    @Autowired
    private ItemMapper itemMapper;
    @RequestMapping("/itemList.action")
    public ModelAndView itemList(){
//        查询数据库商品
        List<Item> list = itemMapper.queryALll();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemList",list);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }
}
