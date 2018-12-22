package com.itheima.web;

import com.itheima.domain.Conect;
import com.itheima.service.ContectServiceImpl;
import com.itheima.service.ServiceContact;

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
 * @Date: 2018/11/26 13:59
 * @Version 1.0
 */
@WebServlet("/ServletContact")
public class ServletContact extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ServiceContact serviceContact = new ContectServiceImpl();
        try {
            List<Conect> list = serviceContact.querryAll();
            request.setAttribute("list",list);
            request.getRequestDispatcher("/index.jsp").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
