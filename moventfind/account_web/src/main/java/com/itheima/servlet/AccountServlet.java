package com.itheima.servlet;

import com.itheima.service.ServiceImpl;
import com.itheima.service.ServiceInter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * @Author: MR.z
 * @Date: 2018/12/7 14:57
 * @Version 1.0
 */
public class AccountServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String from = request.getParameter("from");
        String to = request.getParameter("to");
        String moneyStr = request.getParameter("money");
        double money = 0;
        if(moneyStr == null || "".equals(moneyStr.trim())){
            return;
        }
        money = Double.parseDouble(moneyStr);
        ServiceInter serviceInter = new ServiceImpl();
            serviceInter.tranFer(from,to,money);
            request.getRequestDispatcher("/success.html").forward(request,response);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
