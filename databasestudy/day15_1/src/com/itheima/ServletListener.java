package com.itheima;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * @Author: MR.z
 * @Date: 2018/11/27 18:36
 * @Version 1.0
 */
@WebListener
public class ServletListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        int count = 0;
        ServletContext servletContext = servletContextEvent.getServletContext();
        servletContext.setAttribute("name",count);
        

    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
