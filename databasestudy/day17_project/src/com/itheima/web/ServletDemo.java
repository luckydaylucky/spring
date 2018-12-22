package com.itheima.web;

import com.itheima.service.ServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 19:31
 * @Version 1.0
 */
@WebServlet("/ServletDemo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text:html;charset=UTF-8");

        String name = request.getParameter("name");
        ServiceImpl service = new ServiceImpl();
        int count = 0;
        try {
            count = service.ServiceFind(name);
            response.getWriter().print(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
