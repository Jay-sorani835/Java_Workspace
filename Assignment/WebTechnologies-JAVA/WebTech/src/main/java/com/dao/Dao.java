package com.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import com.model.Model;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Dao 
{
	void register(Model m)
	{
		String firstname, lastname, email, mobile, password, gender;
		
		firstname = m.getFirstname();
		lastname = m.getLastname();
		email = m.getEmail();
		mobile = m.getMobile();
		password = m.getPassword();
		gender = m.getGender();
		
		System.out.println("First Name : "+firstname + "\n");
		System.out.println("last Name : "+lastname + "\n");
		System.out.println("Email : "+email + "\n");
		System.out.println("Mobile : "+mobile + "\n");
		System.out.println("Password : "+password + "\n");
		
		if("male".equals(gender))
		{
			System.out.println("Gender : " + gender);
			
		}
		else
		{
			System.out.println("Gender : " + gender);
			
		}
	}
}
