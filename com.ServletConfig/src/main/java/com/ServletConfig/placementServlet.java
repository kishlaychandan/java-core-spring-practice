package com.ServletConfig;

import java.io.IOException;

import javax.servlet.ServletConfig;
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
			
		ServletConfig cfg=getServletConfig();
		String job=cfg.getInitParameter("JOB");
		resp.getWriter().print("placememt team : "+job);
	
	

}
}