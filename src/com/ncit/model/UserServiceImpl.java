package com.ncit.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.ncit.dbconnection.DatabaseConnection;
import com.ncit.dbconnection.DatabaseConnectionImpl;
import com.ncit.userservice.User;
import com.ncit.userservice.UserService;

public class UserServiceImpl implements UserService {

	@Override
	public boolean isUserValid(User user) {
		// TODO Auto-generated method stub
		
		DatabaseConnection dbConn = new DatabaseConnectionImpl();
		Statement statement =  dbConn.doConnection();
		
		String query = "SELECT * FROM users WHERE username='"+user.getUsername()+"' AND password ='"+user.getPassword()+"'";
		
		
		try {
			ResultSet result = statement.executeQuery(query);
			if(result.next()){
				return true;
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
	public boolean create(User Ruser) {
		// TODO Auto-generated method stub
		
		DatabaseConnection dbConn = new DatabaseConnectionImpl();
		Statement statement =  dbConn.doConnection();
		
		//String query = "SELECT * FROM users WHERE username='"+user.getUsername()+"' AND password ='"+user.getPassword()+"'";
		
		String query= "INSERT INTO `users`(`id`, `fullname`, `username`, `password`, `email`, `mobile`) VALUES ('"+Ruser.getId()+"','"+Ruser.getFullname()+"','"+Ruser.getUsername()+"','"+Ruser.getPassword()+"','"+Ruser.getEmail()+"','"+RSuser.getMobile()+"')";
		
		try {
			ResultSet result = statement.executeQuery(query);
			if(result.next()){
				return true;
			}
			else{
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}


}
