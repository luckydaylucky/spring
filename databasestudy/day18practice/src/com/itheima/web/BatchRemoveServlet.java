package com.itheima.web;

import com.itheima.domain.Emp;
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
 * @Date: 2018/12/4 16:24
 * @Version 1.0
 */
@WebServlet("/BatchRemoveServlet")
public class BatchRemoveServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
//        获取参数
        String arrIds = request.getParameter("ids");
        String [] arr = arrIds.split(",");

        ServiceEmp serviceEmp = new ServiceEmpImpl();
        for (String idStr : arr) {
            int id = Integer.parseInt(idStr);
            try {
                serviceEmp.servdel(id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        response.sendRedirect("/day18practice/show.html");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
