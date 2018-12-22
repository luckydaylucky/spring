package com.itheima.ajax;

import java.io.IOException;

/**
 * @Author: MR.z
 * @Date: 2018/11/30 15:33
 * @Version 1.0
 */
@javax.servlet.annotation.WebServlet("/ServletAjax")
public class ServletAjax extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        this.doPost(request, response);
    }
}
