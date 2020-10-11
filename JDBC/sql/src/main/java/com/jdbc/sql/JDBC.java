package com.jdbc.sql;

import java.sql.*;

public class JDBC {

	public static void main(String[] args) throws Exception {

		String url = "jdbc:mysql://localhost:3306/jdbc";
		String uname = "root";
		String pass = "1234";
		String query = "select * from gadgets";
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, uname, pass);

		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);

		// PreparedStatement ps = con.prepareStatement(query);
		// ResultSet rs = st.executeQuery();

		while (rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			System.out.println(id + " : " + name);
		}

	}

}
