package com.itheima.web;

import com.itheima.domain.Users;
import com.itheima.service.UsersImpl;
import com.itheima.service.userService;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by MR.z on 2018/11/25 11:23
 */
public class Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        Users user = new Users(null,username, password);

        userService service = new UsersImpl();
        boolean b = false;
        try {
             b = service.loginService(user);
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
