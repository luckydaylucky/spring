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
 * @Date: 2018/12/2 21:25
 * @Version 1.0
 */
@WebServlet("/AddUserServlet")
public class AddUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置编码问题
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
//        获得数值
        String name = request.getParameter("uname");
        String sex = request.getParameter("sex");
        String dept = request.getParameter("dept");
        String tel = request.getParameter("tel");
        String email = request.getParameter("email");
        String address = request.getParameter("address");
        Emp emp = new Emp(0,name,sex,tel,email,address,Integer.parseInt(dept));

        ServiceEmp emp1 = new ServiceEmpImpl();
        try {
            emp1.servAdd(emp);
            response.sendRedirect("/day18practice/show.html");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
