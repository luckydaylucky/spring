package com.itheima.controller;

import com.itheima.pojo.Item;
import com.itheima.pojo.QueryVo;
import com.itheima.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

/**
 * @Author: MR.z
 * @Date: 2018/12/15 7:09
 * @Version 1.0
 */
@Controller
public class ItemController {
@Autowired
private ItemService itemService;

    //http://127.0.0.1://8252000
    @RequestMapping("/itemList.action")
    public ModelAndView itemlist(){
//        查询数据库商品
//        System.out.println("已经访问到了");
        List<Item> list = itemService.queryService();
        ModelAndView modelAndView = new ModelAndView();
//        设置数据
        modelAndView.addObject("itemList",list);
//        设置视图
        modelAndView.setViewName("itemList");
//        返回结果
        return modelAndView;
    }
//根据id查询商品
//    @RequestMapping("/itemEdit.action")
//    public ModelAndView itemEdit(HttpServletRequest request){
//        String sid = request.getParameter("id");
//        int id = Integer.parseInt(sid);
//
//        Item item = itemService.queryByid(id);
//
////        声明modelview
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("itemEdit");
//        modelAndView.addObject("item",item);
//        return modelAndView;
//    }

//    使用model根据id查询
//    @RequestMapping("itemEdit.action")
//    public String itemEdit(HttpServletRequest request,Model model){
//        String sid = request.getParameter("id");
//        int id = Integer.parseInt(sid);
//
//        Item item = itemService.queryByid(id);
//        使用model封装数据
//        model.addAttribute("item",item);
//        return "itemEdit";
//    }

//    使用modelmap根据id查询
//    @RequestMapping("itemEdit.action")
//    public String itemEdit(HttpServletRequest request, ModelMap modelMap){
//        String sid = request.getParameter("id");
//        int id = Integer.parseInt(sid);
//
//        Item item = itemService.queryByid(id);
//
//        modelMap.addAttribute("item",item);
//        return "itemEdit";
//    }

//    绑定简单数据类型
    @RequestMapping("itemEdit.action")
    public String itemEdit(@RequestParam(value = "id" ,required = true,defaultValue = "3") int id1 , ModelMap modelMap){
        Item item = itemService.queryByid(id1);
        modelMap.addAttribute("item", item);
        return "itemEdit";



    }

    //    使用pojo类型对商品进行修改
    @RequestMapping("updateItem")
//    pojo接受要保证pojo属性名和参数名一样
//    图片上传必须使用multipartfile
    public String updateItem(Item item, MultipartFile pictureFile) throws IOException {
//        生成uuid作为图片名称
        String uuid = UUID.randomUUID().toString();
//        获取图片原始名称
        String originalFilename = pictureFile.getOriginalFilename();
//        获取图片原始后缀
        String substring = originalFilename.substring(originalFilename.lastIndexOf("."));
//        图片上传核心代码
        pictureFile.transferTo(new File("E:\\javaee\\springmvcone\\upload"+uuid+substring));

//回显图片

        item.setPic(uuid + substring);
        itemService.updateByid(item);
//        return "success";

        return "forward:/itemEdit.action";
    }

//    绑定包装类型pojo
//    @RequestMapping("queryItem")
//    public String querItem(QueryVo queryVo){
//        System.out.println(queryVo.getItem().getId());
//        System.out.println(queryVo.getItem().getName());
//        return "success";
//    }

//    采用数组接受参数
    @RequestMapping("queryItem")
    public String queryItem(QueryVo queryVo,Integer[] ids){
        System.out.println(queryVo.getItem().getId());
        System.out.println(queryVo.getItem().getName());
        System.out.println(queryVo.getIds().length);
        return "success";
    }

//    采用list接收参数

    @RequestMapping(value = {"itemList","itemAll"})
    public ModelAndView queryItem(){
        List<Item> list = this.itemService.queryService();
        ModelAndView mv = new ModelAndView("itemList");
        mv.addObject("itemList",list);
        return mv;
    }


    @RequestMapping("itemList")
    public @ResponseBody Item jackSon(@RequestBody Item item){
        return item;
    }

    @RequestMapping("item/id")
    @ResponseBody
    public Item queryItemByid(@PathVariable() Integer id){
        Item item = this.itemService.queryByid(id);
        return item;
    }









}
