package com.jdbcDemo;
import java.sql.*;
public class ConnectionDemo {
public static void main(String args[]) throws Exception {
	String driver="oracle.jdbc.driver.OracleDriver";
	String url="jdbc:oracle:thin:@localhost:1521:xe";
	String user="system";
	String pass="system";
//	String sql= "CREATE TABLE cricketers(jersy NUMBER,name VARCHAR2(20))";
	String sql= "INSERT INTO cricketers values(07,'Dhoni')";
	//load the driver
	Class.forName(driver);
	
	//establish connection
	Connection con=DriverManager.getConnection(url,user,pass);
	
	//Creating statement
	Statement st=con.createStatement();
	st.execute(sql);
	System.out.println("Connection Successfull");
	
	

}
}
