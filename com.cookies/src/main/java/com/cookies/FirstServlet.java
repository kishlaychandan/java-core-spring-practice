package com.cookies;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp )throws IOException, ServletException {
		String c=req.getParameter("cri");
		String f=req.getParameter("foot");
		
		//crreating cookies
		Cookie c1=new Cookie("cricketers", c);
		Cookie c2=new Cookie("footballer", f);
		
		
		resp.addCookie(c1);
		resp.addCookie(c2);
		
		//redirecting to secondServlet
		resp.sendRedirect("sec"); 
		
	
	

}
}