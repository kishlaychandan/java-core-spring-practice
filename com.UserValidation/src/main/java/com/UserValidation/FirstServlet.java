package com.UserValidation;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/first")
public class FirstServlet extends HttpServlet {
	public void doGet(HttpServletRequest req,HttpServletResponse resp )throws IOException, ServletException {
		String c=req.getParameter("cri");
		String f=req.getParameter("foot");
		HttpSession sess=req.getSession();
		sess.setAttribute("cricketers",c);
		sess.setAttribute("footballer",f);
		
		
		
		
		//redirecting to secondServlet
		resp.sendRedirect("sec"); 
		
	
	

}
}