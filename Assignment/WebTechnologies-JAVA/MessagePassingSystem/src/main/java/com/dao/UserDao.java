package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.connect.Util;
import com.model.user;

public class UserDao 
{
	public static int addUser(user u)
	{
		Connection con = Util.getconnect();
		int status = 0;
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into user (fname,lname,email,mobile) values(?,?,?,?)");
			ps.setString(1, u.getFname());
			ps.setString(2, u.getLname());
			ps.setString(3, u.getEmail());
			ps.setString(4, u.getMobile());
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
		
	}
	public static user getUserById(String email1)
	{
		user u = null;
		Connection con = Util.getconnect();
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from user where email=?");
			ps.setString(1, email1);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int u_id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String email = set.getString(4);
				String mobile = set.getString(5);
				
				u = new user();
				u.setUid(u_id);
				u.setFname(fname);
				u.setLname(lname);
				u.setEmail(email);
				u.setMobile(mobile);
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		return u;
	}
}
