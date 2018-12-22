package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.ServiceImpl;
import com.itheima.service.ServiceInte;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 16:25
 */
public class ServletContex extends HttpServlet {
    @Override
    public void init() throws ServletException {
        ServletContext servlet = this.getServletContext();
        int count = 0;
        servlet.setAttribute("count",count);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pas = req.getParameter("password");

        User user = new User(null,name,pas);

        ServiceInte service = new ServiceImpl();
        boolean flag = false;
        try {
            flag = service.loginService(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if(flag){
            ServletContext servlet = this.getServletContext();
            Integer count = (Integer) servlet.getAttribute("count");
            count ++;
            servlet.setAttribute("count",count);
            resp.sendRedirect("/SuccesServlet");
        }else {
            resp.sendRedirect("/FailServlet");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
