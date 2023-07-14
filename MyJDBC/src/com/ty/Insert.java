package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Insert {
	static String name="Dibya";
	static String email="dibya123@gmail.com";
	static String password="dibya123";
	static String gender="male";
	static String city="Angul";

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root","Sidhartha@1200");
	//positional parameter
		PreparedStatement preparedStatement=connection.prepareStatement("insert into register values(?,?,?,?,?)");
	preparedStatement.setString(1, name);
	preparedStatement.setString(2, email);
	preparedStatement.setString(3, password);
	preparedStatement.setString(4, gender);
	preparedStatement.setString(5, city);
	int i=preparedStatement.executeUpdate();
	if(i>0) {
		System.out.println("Success");
	}
	else {
		System.out.println("fail");
	}
	connection.close();
	}

}
