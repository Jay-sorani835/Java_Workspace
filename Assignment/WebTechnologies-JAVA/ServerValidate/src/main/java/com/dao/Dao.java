package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.PreparedStatement;
import com.model.Model;

public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/servervalidate","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	public static int register(Model m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into info1 (fname,lname,email,phone,password) values (?,?,?,?,?)");
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4,m.getPhone());
			ps.setString(5, m.getPassword());
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	public static List<Model>viewdata()
	{
		List<Model>list = new ArrayList();
		Connection con =Dao.getconnect();
		try 
		{
			
			PreparedStatement ps = con.prepareStatement("select * from info1");
			
			ResultSet set = ps.executeQuery();
			
			
			while(set.next())
			{
				int id = set.getInt(1);
				String fname = set.getString(2);
				String lname = set.getString(3);
				String email = set.getString(4);
				String phone = set.getString(5);
				String password = set.getString(6);
				Model p = new Model();
				p.setId(id);
				p.setFname(fname);
				p.setLname(lname);
				p.setEmail(email);
				p.setPhone(phone);
				p.setPassword(password);
				list.add(p);
			}
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return list;
	}
	public static Model view(int id)
	{
		Connection con =Dao.getconnect();
		Model m = new Model();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from info1 where id=?");
			ps.setInt(1, id);
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id1 = set.getInt("id");
				String fname = set.getString("fname");
				String lname = set.getString("lname");
				String email = set.getString("email");
				String Phone = set.getString("phone");
				String pass = set.getString("password");
				m.setId(id1);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setPhone(Phone);
				m.setPassword(pass);
			}	
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return m;
	}
	public static void deletedata(int id)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("delete from info1 where id=?");
			ps.setInt(1, id);
			
			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			// TODO: handle exception
		}
		
		
	}
	public static int editdata(Model m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			PreparedStatement ps = con.prepareStatement("update info1 set fname=?,lname=?,email=?,phone=?,password=? where id=?");
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPhone());
			ps.setString(5, m.getPassword());
			ps.setInt(6, m.getId());
			
			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
}
