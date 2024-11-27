package com.dao;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;
import java.sql.Blob;

import javax.sql.rowset.serial.SerialBlob;
import javax.sql.rowset.serial.SerialException;
import javax.swing.plaf.basic.BasicCheckBoxMenuItemUI;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.util.Util;
import com.util.Util1;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.Part;

import com.model.ImageModel;
import com.model.User;

public class Dao 
{
	public void insert(User u)
	{
		Session sess = new Util().getconnect();
		Transaction  tr = sess.beginTransaction();
		sess.save(u);
		tr.commit();
		sess.close();
	}
	public User getUserByEmail(String email, String password)
	{
		Connection con = Util1.getconnect();
		User u = null;
		try {
		PreparedStatement ps = con.prepareStatement("select * from user where email=? and password=?");
		
			ps.setString(1, email);
			ps.setString(2, password);
			
			ResultSet set = ps.executeQuery();
			
			while(set.next())
			{
				u = new User();
				u.setId(set.getInt(1));
				u.setFname(set.getString(2));
				u.setLname(set.getString(3));
				u.setEmail(set.getString(4));
				u.setMobile(set.getString(5));
				u.setPassword(set.getString(6));
				u.setGender(set.getString(7));
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			
		}
		return u;
	}
	public static int update(User u,String email)
	{
		Connection con = Util1.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("update user set fname=?, lname=?, email=?, mobile=?, gender=? where email=?");
			ps.setString(1, u.getFname());
			ps.setString(2,u.getLname());
			ps.setNString(3,  u.getEmail());
			ps.setString(4, u.getMobile());
			ps.setString(5, u.getGender());
			ps.setString(6, email);
			
			status = ps.executeUpdate();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	public static int changePass(String email, String password)
	{
		Connection con = Util1.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("Update user set password=? where email=?");
			ps.setString(1, password);
			ps.setString(2, email);
			
			status = ps.executeUpdate();
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		
		return status;
	}
	public static List<ImageModel> getAllImage(String email)
	{
		List<ImageModel> i = new ArrayList<ImageModel>();
		try {
			
			Connection con = Util1.getconnect();
			PreparedStatement ps= con.prepareStatement("select * from image where email=?");
			ps.setString(1, email);
			ResultSet rs = (ResultSet) ps.executeQuery();
			
			while(rs.next())
			{
				ImageModel d1 = new ImageModel();
				d1 = new ImageModel();
				d1.setId(rs.getInt("id"));
				
				//d1.setP_image(rs.getString("p_image"));
				
				 byte[] imgData = rs.getBytes("image"); // blob field 
		         String encode = Base64.getEncoder().encodeToString(imgData);
		         d1.setImage(encode);
		         d1.setTime(rs.getString("time"));
		         //request.setAttribute("imgBase", encode);
				i.add(d1);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return i;
	}
	public static int uploadImg(String fileData, String fileName, String email) throws SerialException, SQLException
	{
		//int itid = ImageDao.getITid(nam);
		byte[] fileBytes = Base64.getDecoder().decode(fileData);
		Blob blob = new SerialBlob(fileBytes);
		int r = 0;
		Connection con = Util1.getconnect();
		try {
			PreparedStatement ps = con.prepareStatement("insert into image(image, email) values(?,?)");
			ps.setBlob(1, blob);
			ps.setString(2, email);
				
			r = ps.executeUpdate();

		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return r;
	}
}
