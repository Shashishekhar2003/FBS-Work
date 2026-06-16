package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/getcount")
public class counterservlet extends HttpServlet{
	
	protected void doGet (HttpServletRequest request,HttpServletResponse response) throws ServletException ,IOException{
		response.setContentType("text/html");
		PrintWriter out =response.getWriter();
		int cnt = Integer.parseInt(request.getParameter("count"));
		cnt++;
		out.println("<h1> You Click "+cnt+" Times");
		out.println("<a href='getcount?count"+cnt+"'>Click me </a>");
		out.println("<link rel='stylesheet' href='css/style.css'>");
	}
	

}
