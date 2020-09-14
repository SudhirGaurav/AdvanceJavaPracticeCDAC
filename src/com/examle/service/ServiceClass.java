package com.examle.service;

import javax.servlet.http.HttpServletRequest;

public class ServiceClass {

	
	public String computeString(HttpServletRequest request) {
		
		String ret=null;
		
		String boxValue=request.getParameter("value");
		
		int length=boxValue.length();
		ret = length%2==0? "/WEB-INF/page/even.html":"/WEB-INF/page/odd.html";
		return ret;
		
	}
}
