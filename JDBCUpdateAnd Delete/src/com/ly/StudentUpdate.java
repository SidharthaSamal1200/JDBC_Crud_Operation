package com.ly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class StudentUpdate {
	static String password1="Sidha@9439";
	static String email1="Sid123@gmail.com";
	

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection	=DriverManager.getConnection("jdbc:mysql://localhost:3306/myjdbc","root","Sidhartha@1200");
	PreparedStatement preparedStatement=connection.prepareStatement("update student set password=?,email=?");
	preparedStatement.setString(1,password1 );
	preparedStatement.setString(2,email1);
	int i=preparedStatement.executeUpdate();
	if(i>0) {
		System.out.println("Updataed successful");
	}
	else {
		System.out.println("Unsuccessful");
	}
	
	
	
		

	}

}
