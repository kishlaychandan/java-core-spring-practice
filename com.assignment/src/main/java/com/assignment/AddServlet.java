package com.assignment;
import java.io.IOException;
import java.util.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/add")
public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req,HttpServletResponse resp)throws IOException {
		
		int num1=Integer.parseInt(req.getParameter("n1"));
		int num2=Integer.parseInt(req.getParameter("n2"));
		int sum=num1+num2;
		resp.getWriter().print("Sum: "+sum);
		
	}
	
}
