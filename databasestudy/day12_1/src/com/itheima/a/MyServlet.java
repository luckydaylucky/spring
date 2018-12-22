package com.itheima.a;

import javax.servlet.*;
import java.io.IOException;

public class MyServlet implements Servlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("HelloWorld,服务器接收到了用户的请求");
    }


    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("Servlet创建成功，init方法执行");
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
        System.out.println("Servlet要销毁了，destory方法执行");
    }
}
