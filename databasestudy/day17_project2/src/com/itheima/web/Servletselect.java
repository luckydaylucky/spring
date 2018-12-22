package com.itheima.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.user;
import com.itheima.service.ServiceImpl;
import com.itheima.service.ServiceInter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 21:48
 * @Version 1.0
 */
@WebServlet("/Servletselect")
public class Servletselect extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String name = request.getParameter("name");
        ServiceInter serviceInter = new ServiceImpl();
        try {
            List<user> list = serviceInter.ServiceUser(name);
            ObjectMapper om = new ObjectMapper();
            String namee = om.writeValueAsString(list);
            response.getWriter().print(namee);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
