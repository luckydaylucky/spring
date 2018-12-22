package com.itheima.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.itheima.domain.EmpDept;
import com.itheima.service.ServiceEmp;
import com.itheima.service.ServiceEmpImpl;

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
 * @Date: 2018/12/2 19:01
 * @Version 1.0
 */
@WebServlet("/ShowServlet")
public class ShowServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        ServiceEmp serviceEmp = new ServiceEmpImpl();

        List<EmpDept> empDepts = serviceEmp.serviceEmp();
        ObjectMapper om = new ObjectMapper();
        String uname = om.writeValueAsString(empDepts);
        response.getWriter().print(uname);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
