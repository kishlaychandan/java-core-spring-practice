package com.cookies;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/sec")
public class SecondServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		//getting cookies
		Cookie[] cookies=req.getCookies();
		
		String c=cookies[0].getValue();
		String f=cookies[1].getValue();
		
		resp.getWriter().print("Cricketers: "+c);
		resp.getWriter().print("footballer: "+f);
	}
	
	
	
}
