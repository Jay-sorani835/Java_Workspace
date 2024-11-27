package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.mail.Session;

import com.model.MailModel;
import com.model.SignupModel;

import jakarta.servlet.http.HttpSession;


public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/message","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static int signup(SignupModel m)
	{
		Connection con =Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into user (username,email,password) values (?,?,?)");
			ps.setString(1,m.getUsername());
			ps.setString(2,m.getEmail());
			ps.setString(3,m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	public static SignupModel login(SignupModel m)
	{
		SignupModel m2=null;
		
		Connection con = Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from user where email=? and password=?");
			ps.setString(1,m.getEmail());
			ps.setString(2,m.getPassword());
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id = set.getInt(1);
				String username = set.getString(2);
				String email = set.getString(3);
				
				String password = set.getString(4);
				
				m2 = new SignupModel();
				
				m2.setId(id);
				m2.setUsername(username);
				m2.setEmail(email);
				m2.setPassword(password);
				
			}
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m2;	
	}
	
	public static List<MailModel> getMSG(String email)
	{
		MailModel m = null;
		List<MailModel> i = new ArrayList<MailModel>();
		Connection con = Dao.getconnect();
		try
		{
			PreparedStatement ps = con.prepareStatement("select * from sent where remail=?");
			ps.setString(1, email);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int id = set.getInt("id");
				String semail = set.getString("semail");
				String remail = set.getString("remail");
				String subject = set.getString("subject");
				String message = set.getString("message");
				
				m = new MailModel();
				m.setId(id);
				m.setSemail(semail);
				m.setRemail(remail);
				m.setSubject(subject);
				m.setMessage(message);
				
				i.add(m);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return i;
	}
	public static void Update(SignupModel m)
	{
		Connection con =Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("update user set username=?, password=? where email=?");
			ps.setString(1,m.getUsername());
			ps.setString(2,m.getPassword());
			ps.setString(3,m.getEmail());
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
}
