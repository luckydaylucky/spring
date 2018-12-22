package com.itheima.controller;

import com.itheima.pojo.BaseDice;
import com.itheima.pojo.Customer;
import com.itheima.pojo.QueryVo;
import com.itheima.service.BaseDictService;
import com.itheima.service.CustomerService;
import com.itheima.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/18 5:49
 * @Version 1.0
 */
@Controller
@RequestMapping("customer")
public class CustomerController {

    @Value("${from_type}")
    private String fromT_ypeCode;

    @Value("${industy_type}")
    private String industy_typeCode;

    @Value("${level_type}")
    private String level_typeCode;

    @Autowired
    private BaseDictService baseDictService;

    @Autowired
    private CustomerService customerService;

    @RequestMapping("list")
    public String list(QueryVo queryVo,Model model){
//        查询客户来源
        List<BaseDice> fromtype = baseDictService.queryBaseDictByTypeCode(fromT_ypeCode);
//        查询所属行业

        List<BaseDice> industryType = baseDictService.queryBaseDictByTypeCode(industy_typeCode);
//        查询客户级别
        List<BaseDice> levelType = baseDictService.queryBaseDictByTypeCode(level_typeCode);
//        把查询条件放到model中传递给前台页面
        model.addAttribute("fromType",fromtype);
//        客户行业
        model.addAttribute("industryType",industryType);
//        客户级别
        model.addAttribute("levelType",levelType);

//        根据条件分页查询客户数据
        Page<Customer> page = customerService.queryCustomerByQueryVo(queryVo);
//把查询到得数据放到model中传递给前台页面
        model.addAttribute("page",page);
        return "customer";


    }

}
