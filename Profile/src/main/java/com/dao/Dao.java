package com.dao;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import com.model.Model;

import jakarta.servlet.http.Part;

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
	
	public static int signup(Model m)
	{
		Connection con =Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into profile (firstname,lastname,email,phone,hobby,city,gender,pass,image) values (?,?,?,?,?,?,?,?,?)");
			

			ps.setString(1,m.getFirstname());
			ps.setString(2,m.getLastname());
			ps.setString(3,m.getEmail());
			ps.setString(4,m.getPhone());
			ps.setString(5, m.getHobby());
			ps.setString(6, m.getCity());
			ps.setString(7, m.getGender());
			ps.setString(8, m.getPass());
			ps.setString(9, m.getPass());
			
			//Part p = request.getPart("image");
			//InputStream io = p.getInputStream();
			//ps.setBlob(9, io);
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	

	public static Model signin(Model n)
	{
		Connection con =Dao.getconnect();
		Model m = null;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from profile where email=? and password=?");
			ps.setString(1, m.getEmail());
			ps.setString(2, m.getPass());
			
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return m;
	}
	
	public static List<Model> getAll()
	{
		List<Model> i = new ArrayList<Model>();
		try {
			
			Connection con = Dao.getconnect();
			PreparedStatement ps= con.prepareStatement("select * from profile");
			
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
//				Model d1 = new Model();
//				d1 = new Model();
//				d1.setId(rs.getInt(1));
//				d1.setFname(rs.getString(2));;
//				d1.setLname(rs.getString(3));
//				d1.setEmail(rs.getString(4));
//				d1.setMobile(rs.getString(5));
//				d1.setHobby(rs.getString(6));
//				d1.setCity(rs.getString(7));
//				d1.setGender(rs.getString(8));
//				d1.setPass(rs.getString(9));
//				
//				 byte[] imgData = rs.getBytes(10); // blob field 
//		         String encode = Base64.getEncoder().encodeToString(imgData);
//		         d1.setProfile(encode);
//		         //request.setAttribute("imgBase", encode);
//		         i.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return i;
	}
}
