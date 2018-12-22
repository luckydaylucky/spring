package com.itheima.fileter;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

/**
 * @Author: MR.z
 * @Date: 2018/11/27 9:46
 * @Version 1.0
 */
public class Demo1filter implements Filter {

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("系统已拦截 1秒后放行");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
//        filterChain.doFilter();
    }

    @Override
    public void destroy() {

    }
}
