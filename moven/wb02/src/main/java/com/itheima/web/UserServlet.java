package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.serviceImpl;
import com.itheima.service.serviceUser;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/12/6 11:18
 * @Version 1.0
 */
public class UserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        serviceUser serviceUser = new serviceImpl();
            List<User> users = serviceUser.servicUser();
            request.setAttribute("users",users);
            request.getRequestDispatcher("/userList.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
