package com.ServletContext;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
//@WebServlet("/p")
public class placementServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp )throws IOException, ServletException {
		ServletContext context=getServletContext();
		String ctsValue=context.getInitParameter("Mission");
		
		resp.getWriter().print("Placement mission"+ctsValue);
	

}
}