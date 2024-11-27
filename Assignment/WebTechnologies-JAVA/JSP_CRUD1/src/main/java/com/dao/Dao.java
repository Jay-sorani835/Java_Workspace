package com.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.model.SignupModel;


public class Dao 
{
	public static Connection getconnect()
	{
		Connection con = null;
		
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jspcrud","root","");
		}
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return con;
	}
	
	public static int register(SignupModel m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into info1 (fname,lname,email,phone,gender,password) values (?,?,?,?,?,?)");
			ps.setString(1,m.getFname());
			ps.setString(2,m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4,m.getPhone());
			ps.setString(5,m.getGender());
			ps.setString(6, m.getPass());
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	}
	public static List<SignupModel>viewdata()
	{
		List<SignupModel>list = new ArrayList<>();
		Connection con =Dao.getconnect();
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from info1");
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				int id1 = set.getInt("id");
				String fname = set.getString("fname");
				String lname = set.getString("lname");
				String email = set.getString("email");
				String Phone = set.getString("phone");
				String gender = set.getString("gender");
				String pass = set.getString("password");
				SignupModel m = new SignupModel();
				m.setId(id1);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setPhone(Phone);
				m.setGender(gender);
				m.setPass(pass);
				list.add(m);
			}
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return list;
	}
	public static List<SignupModel>view(int id)
	{
		List<SignupModel>list = new ArrayList<>();
		Connection con =Dao.getconnect();
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
				String gender = set.getString("gender");
				String pass = set.getString("password");
				SignupModel m = new SignupModel();
				m.setId(id1);
				m.setFname(fname);
				m.setLname(lname);
				m.setEmail(email);
				m.setPhone(Phone);
				m.setGender(gender);
				m.setPass(pass);
				list.add(m);
			}
		
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
		return list;
	}
	
	public static int delete(int id)
	{
		Connection con =Dao.getconnect();
		int status = 0;
		String fname = null, lname = null, email = null, Phone = null, gender = null, pass = null;
		try 
		{
			PreparedStatement ps = con.prepareStatement("select * from info1 where id=?");
			ps.setInt(1,id);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int id1 = set.getInt(1);
				fname = set.getString(2);
				lname = set.getString(3);
				email = set.getString(4);
				Phone = set.getString(5);
				gender = set.getString(6);
				pass = set.getString(7);
			
				PreparedStatement ps1 = con.prepareStatement("insert into deletedata1 (fname,lname,email,phone,gender,password) values(?,?,?,?,?,?)");
				ps1.setString(1,fname);
				ps1.setString(2,lname);
				ps1.setString(3,email);
				ps1.setString(4,Phone);
				ps1.setString(5,gender);
				ps1.setString(6,pass);
				
				
				status = ps1.executeUpdate();
				if(status > 0) {
					Dao.deletedata(id);
				}
			}
		}
		catch (Exception e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return status;
	
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
	public static int editdata(SignupModel m)
	{
		Connection con = Dao.getconnect();
		int status = 0;
		try 
		{
			PreparedStatement ps = con.prepareStatement("update info1 set fname=?,lname=?,email=?,phone=?,gender=?,password=? where id=?");
			ps.setString(1, m.getFname());
			ps.setString(2, m.getLname());
			ps.setString(3, m.getEmail());
			ps.setString(4, m.getPhone());
			ps.setString(5, m.getGender());
			ps.setString(6, m.getPass());
			ps.setInt(7, m.getId());
			
			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
}
