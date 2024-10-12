package com.example.services;

public class LoginImpl implements LoginInterface {

	public String Authenticate(String uname, String pass) {
		if(uname.equals("users1") && pass.equals("users1")) {
			return "users";
		}
		else if(uname.equals("admin1") && pass.equals("admin1")) {
			return "admin";
		}
		return null;
	}

	
	
}
