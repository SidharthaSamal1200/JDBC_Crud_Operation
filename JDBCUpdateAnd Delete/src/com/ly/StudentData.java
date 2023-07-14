package com.ly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentData {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc", "root",
				"Sidhartha@1200");
		PreparedStatement preparedStatement = connection
				.prepareStatement("insert into student values('Sidhartha','phno','Sid123@gmail.com','Sid@123')");
		int i = preparedStatement.executeUpdate();
		if (i > 0) {
			System.out.println("Success");
		} else {
			System.out.println("Unsuccessful");
		}
	}

}
