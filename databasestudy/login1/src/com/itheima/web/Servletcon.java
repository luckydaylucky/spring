package com.itheima.web;

import com.itheima.domain.User;
import com.itheima.service.ServiceImpl;
import com.itheima.service.ServiceInter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 14:02
 */
public class Servletcon extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");
        String pas = req.getParameter("password");
        User user = new User(null,name,pas);

        ServiceInter serviceInter = new ServiceImpl();
        boolean b = false;

        try {
            b = serviceInter.loginService(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if(b){
            System.out.println("登陆成功"+user.getUsername());
        }else {
            System.out.println("登陆失败");
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
