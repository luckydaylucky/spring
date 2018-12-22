package com.ithei.servletcontext;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Servlet3Demo extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        ServletContext context = this.getServletContext();
//
//        InputStream in = context.getResourceAsStream("myfile.txt");
//        Properties p = new Properties();
//        p.load(in);
//        System.out.println(p);



        ServletContext context1 = this.getServletContext();

//        InputStream in1 = context1.getResourceAsStream("aa.properties");
//
//        Properties pp = new Properties();
//        pp.load(in1);
//        System.out.println(pp);

        InputStream in1 = context1.getResourceAsStream("/WEB-INF/cc.properties");

        Properties pp = new Properties();
        pp.load(in1);
        System.out.println(pp);

        String path = context1.getRealPath("cc.properties");
        System.out.println(path);



    }
}
