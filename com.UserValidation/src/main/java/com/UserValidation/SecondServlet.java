package com.UserValidation;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sec")
public class SecondServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		
		
		HttpSession sess=req.getSession();
		//extracting values
		String c=(String)sess.getAttribute("cricketers");
		String f=(String)sess.getAttribute("footballer");
		
		
		resp.getWriter().print("Cricketers: "+c);
		resp.getWriter().print("footballer: "+f);
	}
	
	
	
}
