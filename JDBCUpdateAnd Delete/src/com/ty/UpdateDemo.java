package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UpdateDemo {
	static String city="Bhubaneswar";
	static String email="pravin123@gmail.com";
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "Sidhartha@1200");
		PreparedStatement preparedStatement=connection.prepareStatement("update register set city=?,email=?");
		preparedStatement.setString(1,city);
		preparedStatement.setString(2, email);
		
		int i=preparedStatement.executeUpdate();
		if(i>0) {
			System.out.println("Updated successfully");
		}
		else {
			System.out.println("Not Updated");
		}
		
		}

}
