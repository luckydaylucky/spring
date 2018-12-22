package com.itheima.practice;

import javax.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

/**
 * @Author: MR.z
 * @Date: 2018/11/28 17:03
 * @Version 1.0
 */
public class FilterTest implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        String username = filterConfig.getInitParameter("username");
        System.out.println(username);
        String age = filterConfig.getInitParameter("age");
        System.out.println(age);
        Enumeration<String> en = filterConfig.getInitParameterNames();
        while (en.hasMoreElements()){
            String name = en.nextElement();
            System.out.println("name"+" "+filterConfig.getInitParameter(name));
            ServletContext conent = filterConfig.getServletContext();
            conent.setAttribute("nn","225");
        }

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String nn = (String) servletRequest.getServletContext().getAttribute("nn");
        System.out.println(nn);
    }

    @Override
    public void destroy() {

    }
}
