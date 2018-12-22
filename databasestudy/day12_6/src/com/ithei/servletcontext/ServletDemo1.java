package com.ithei.servletcontext;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ServletDemo1")
public class ServletDemo1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request,response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//       1、中上下文对象获取方式

        ServletConfig servletConfig = this.getServletConfig();
        ServletContext servletContext = servletConfig.getServletContext();


//        2、servlet获取方式
        ServletContext servletContext1 = this.getServletContext();

//        3、servlet获取方式
        ServletContext servletContext2 = request.getServletContext();
//          获取web文件类型
//        String mime = servletContext1.getMimeType("MyFile.txt");
//        System.out.println(mime);
//        获取web文件路径
        String mm = servletContext1.getRealPath("MyFile.txt");
        System.out.println(mm);

    }
}
