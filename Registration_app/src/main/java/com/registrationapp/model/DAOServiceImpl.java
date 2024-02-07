package com.registrationapp.model;

import java.sql.*;

public class DAOServiceImpl implements DAOService {
	private Connection con;
	private Statement stmnt;
	
	@Override
	public void connectDB() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/nov_registration_db","root","test");
			stmnt = con.createStatement();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}

	@Override
	public boolean verifyLogin(String email, String password) {
		try {
			ResultSet result= stmnt.executeQuery("select * from login where email='"+email+"'and password='"+password+"'");
			return result.next();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public void createRegistration(String name, String course, String email, String mobile) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteRegistration(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateRegistration(String email, String mobile) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
