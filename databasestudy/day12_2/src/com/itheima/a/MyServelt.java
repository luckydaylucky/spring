package com.itheima.a;

import javax.servlet.*;
import java.io.IOException;

public class MyServelt implements Servlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("我已接收到请求");
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }



    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }
}
