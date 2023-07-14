package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetData {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "Sidhartha@1200");
		PreparedStatement preparedStatement=connection.prepareStatement("select * from register");
		ResultSet resultSet=preparedStatement.executeQuery();
		while(resultSet.next()) {
			String name1=resultSet.getString("name");
			String email1=resultSet.getString("email");
			String password1=resultSet.getString("password");
			String gender1=resultSet.getString("gender");
			String city1=resultSet.getString("city");
			System.out.println("Name: "+name1+"Email: "+email1+"Password: "+password1+"Gender: "+gender1+"City: "+city1);
		}
		connection.close();

	}

}
