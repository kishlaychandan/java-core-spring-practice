package com.jdbcDemo;
import java.util.Scanner;
import java.sql.*;
public class InsertDemo {
	public static void main(String args[])throws Exception {
		String driver="oracle.jdbc.driver.OracleDriver";
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		String user="system";
		String pass="system";
		String sql="INSERT INTO cricketers VALUES(?,?)";
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the jersy no.");
		int j=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter name");
		String name=sc.nextLine();	
		
//		load the driver
		Class.forName(driver);
		
		//establish conner=ction
		Connection con=DriverManager.getConnection(url,user,pass);
		//preparing the manager
		PreparedStatement ps=con.prepareStatement(sql);
		ps.setInt(1, j);
		ps.setString(2, name);
		
		ps.executeUpdate();
		
		 
		
	}
}
