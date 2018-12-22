package com.itheima.web;

import com.itheima.service.ServiceEmp;
import com.itheima.service.ServiceEmpImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/12/2 21:26
 * @Version 1.0
 */
@WebServlet("/DeleteServlet")
public class DeleteServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String idStr = request.getParameter("id");
//        判断字符串是否为空如果不为空强转成int类型
        if(idStr==null||" ".equals(idStr.trim())){
            response.getWriter().print(0);
            return;
        }
        int id = Integer.parseInt(idStr);
        ServiceEmp serviceEmp = new ServiceEmpImpl();
            int count = 0;
             count = serviceEmp.servdel(id);
            response.getWriter().print(count);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
