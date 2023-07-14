package com.ty;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteDemo {
	static String email="dibya123@gmail.com";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db","root", "Sidhartha@1200");
		PreparedStatement preparedStatement=connection.prepareStatement("delete from register where email=?");
		preparedStatement.setString(1, email);
		int i=preparedStatement.executeUpdate();
		if(i>0) {
			System.out.println("Success");
		}
		else {
			System.out.println("Unsuccess");
		}
	}

}
