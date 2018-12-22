package com.ithei.servletcontext;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/ResponeDemo1")
public class ResponeDemo1 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String msg = "你好啊你好啊";
        response.setContentType("text/html;charset=utf-8");
//        ServletOutputStream stream = response.getOutputStream();
//        stream.write(msg.getBytes("utf-8"));

        PrintWriter out = response.getWriter();
        out.write(msg);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
