package com.tutorial;

import java.sql.Connection;
import java.sql.DriverManager;

public class Testjdbc {

	public static void main(String[] args) {
		String jdbcUrl="jdbc:mysql://localhost:3306/hibernate_one_to_one_uni?useSSL=false";
		String user = "root";
		String pass = "SCnaidu123$";
	try {
		System.out.println("connect to database:"+ jdbcUrl);
		
		Connection myConn = 
				   DriverManager.getConnection(jdbcUrl,user,pass);
		System.out.println("connection succesful");
	}
catch (Exception exc) {
	exc.printStackTrace();
}
	}

}
