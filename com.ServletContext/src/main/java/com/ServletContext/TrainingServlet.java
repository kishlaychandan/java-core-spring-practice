package com.ServletContext;

import java.io.IOException;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/t")
public class TrainingServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp )throws IOException, ServletException {
 			
		ServletContext context=getServletContext();
		String ctsValue=context.getInitParameter("Mission");
		
		
		
		resp.getWriter().print("Training mission"+ctsValue);
	
	

}
}