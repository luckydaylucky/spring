package com.itheima.json;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 16:10
 * @Version 1.0
 */
public class JsonDemo1 {
    public static void main(String[] args) throws JsonProcessingException {
        ObjectMapper om = new ObjectMapper();
        Person p = new Person("小昭",18,"波斯");
        String s = om.writeValueAsString(p);
        System.out.println(s);
    }



}
