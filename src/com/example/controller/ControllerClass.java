package com.example.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.examle.service.ServiceClass;

/**
 * Servlet implementation class ControllerClass
 */
@WebServlet("/first")
public class ControllerClass extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ControllerClass() {
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Calling post Method");
		
		ServiceClass service =  new ServiceClass();
		String ret=service.computeString(request);
		System.out.println("Return is :"+ret);
		RequestDispatcher requestDisp=	request.getRequestDispatcher(ret);
		requestDisp.forward(request, response);
		//response.getWriter().print("Finally executed !!!");
	}

}
