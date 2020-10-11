package com.jdbc.sql;
import java.sql.*;

public class JDBC_insert {

	public static void main(String[] args) throws Exception {
		
		String uname="root";
		String pass="1234";
		String url = "jdbc:mysql://localhost:3306/jdbc";
	    String query = "insert into gadgets values(106,'Asus')";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		
		int i = st.executeUpdate(query);
		
		System.out.println("Rows affected :"+i);
		
		
		

	}

}
