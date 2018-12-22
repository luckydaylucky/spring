package com.itheima.dowload;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by MR.z on 2018/11/25 21:11
 */
@WebServlet("/DowloadServlet")
public class DowloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/heml;charset=utf-8");
        String filef = request.getParameter("filename");
        String realpath = this.getServletContext().getRealPath("/source/"+filef);
        FileInputStream fis = new FileInputStream(realpath);
        String header = request.getHeader("User-Afent");
        String newfilname = DownLoadUtils.getFileName(header,filef);

        response.setHeader("Content-Disposition","attachment;filename=");
        ServletOutputStream out = response.getOutputStream();

        int len;
        byte[] bytes = new byte[1024 << 3];
        while ((len = fis.read(bytes))!=-1){
            out.write(bytes,0,len);
        }

        fis.close();

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
