package com.itheima.demo;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/26 21:20
 * @Version 1.0
 */
@WebServlet("/ServletJstl")
public class ServletJstl extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Person> list = new ArrayList<>();
        list.add(new Person("东方不败",28));
        list.add(new Person("令狐冲",25));
        list.add(new Person("任盈盈",20));
        request.setAttribute("list",list);
        //转发:
        request.getRequestDispatcher("/demo3.jsp").forward(request,response);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    doPost(request,response);
    }
}
