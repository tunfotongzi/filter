package com.imooc.filter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstFilter implements Filter {
	
	@Override
	public void destroy() {
		System.out.println("destroy---FirstFilter");
	}
	
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("start----doFilter--FirstFilter");
		chain.doFilter(request, response);
		System.out.println("end------doFilter--FirstFilter");
	}

	@Override
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("init----FirstFilter");
	}

}
