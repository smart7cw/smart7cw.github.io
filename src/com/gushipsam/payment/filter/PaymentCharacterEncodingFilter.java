package com.gushipsam.payment.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("*.sv")
public class PaymentCharacterEncodingFilter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, 
			ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		arg0.setCharacterEncoding("UTF-8");
		
		arg1.setCharacterEncoding("UTF-8");
		arg1.setContentType("text/html charset=UTF-8"); 
		
		arg2.doFilter(arg0, arg1);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	}
}
