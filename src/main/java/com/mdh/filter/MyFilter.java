package com.mdh.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Author: madonghao
 * @Date: 2019/1/24 14:03
 */
public class MyFilter implements Filter{

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("MyFilter process...");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {

    }
}
