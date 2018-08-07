package com.cg.servelet.resume;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResumeServlet")
public class ResumeServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Resume resume = new Resume(request.getParameter("FirstName"), request.getParameter("LastName"), request.getParameter("gender"), request.getParameter("HQ"), request.getParameter("date"), request.getParameter("hobbies"), request.getParameter("address"), request.getParameterValues("skills"), request.getParameter("email"), request.getParameter("web"), request.getParameter("contact"), request.getParameter("summary"));
		request.setAttribute("ResumeServlet", resume);
		RequestDispatcher dispatcher = request.getRequestDispatcher("index2.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
