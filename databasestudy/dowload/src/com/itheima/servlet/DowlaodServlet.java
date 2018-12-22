package com.itheima.servlet;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by MR.z on 2018/11/25 19:30
 */
@WebServlet("/DowlaodServlet")
public class DowlaodServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=utf-8");
        String filename = request.getParameter("filename");
        String realPath = this.getServletContext().getRealPath("/source/" + filename);
        FileInputStream fis = new FileInputStream(realPath);
        String header = request.getHeader("User-Agent");
        String newFilename = DownLoadUtils.getFileName(header,filename);

        response.setHeader("Content-Disposition","attachment;filename="+newFilename);

        ServletOutputStream outputStream = response.getOutputStream();
        int len ;
        byte[] arr = new byte[1024 << 3];
        while ((len = fis.read(arr))!=-1){
            outputStream.write(arr,0,len);
        }
        fis.close();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }



}
