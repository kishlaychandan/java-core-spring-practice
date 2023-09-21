package com.ServletsCommunication;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/sec")
public class SecondServlet extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException {
		String str=(String)req.getAttribute("data");
		System.out.println("control came to second servlet");
		int count=str.length();
		resp.getWriter().print("Character count :"+count);
	}
	
	
	
}
