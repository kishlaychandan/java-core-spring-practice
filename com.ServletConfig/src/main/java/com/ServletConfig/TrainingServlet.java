package com.ServletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/t")
public class TrainingServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp )throws IOException, ServletException {
 			
		ServletConfig cfg=getServletConfig();
		String job=cfg.getInitParameter("JOB");
		
		
		
		resp.getWriter().print("Training Team job"+job);
	
	

}
}