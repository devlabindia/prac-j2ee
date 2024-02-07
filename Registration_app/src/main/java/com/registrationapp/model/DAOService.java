package com.registrationapp.model;

public interface DAOService {
	public void connectDB();
	public boolean verifyLogin(String email, String password);
	public void createRegistration(String name, String course, String email, String mobile);
	public void deleteRegistration(String email);
	public void updateRegistration(String email, String mobile);
	
	

}
