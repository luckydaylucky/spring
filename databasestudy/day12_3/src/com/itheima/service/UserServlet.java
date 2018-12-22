package com.itheima.service;

import com.itheima.domain.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("username");

        String password = req.getParameter("password");
        User user = new User(null,name,password);
        UserService service = new UserServiceImpl();
        boolean flag = false;
        try {
            flag = service.loginService(user);
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        if(flag){
            System.out.println("登陆成功,欢迎"+user.getUsername());
        }else {
            System.out.println("登陆失败,用户名或密码错误");
        }
    }
}
