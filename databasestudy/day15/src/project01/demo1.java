package project01;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: MR.z
 * @Date: 2018/11/27 12:16
 * @Version 1.0
 */
public class demo1 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("");
    }

    @Override
    public void destroy() {

    }
}
