package com.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import com.model.UserModel;


public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;
	}
	
	public static List<UserModel> getAll()
	{
		List<UserModel> i = new ArrayList<UserModel>();
		try {
			
			Connection con = Dao.getconnect();
			PreparedStatement ps= con.prepareStatement("select * from profile1");
			
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				UserModel d1 = new UserModel();
				d1 = new UserModel();
				d1.setId(rs.getInt(1));
				d1.setFirstname(rs.getString(2));
				d1.setLastname(rs.getString(3));
				d1.setEmail(rs.getString(4));
				d1.setPhone(rs.getString(5));
				d1.setGender(rs.getString(6));
				d1.setPassword(rs.getString(7));
		        
				i.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return i;
	}
}
