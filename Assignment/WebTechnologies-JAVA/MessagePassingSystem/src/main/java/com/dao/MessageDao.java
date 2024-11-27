package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.connect.Util;
import com.model.message;

public class MessageDao
{
	public static int addMessage(message m)
	{
		Connection con = Util.getconnect();
		int status = 0;
		
		try 
		{
			PreparedStatement ps = con.prepareStatement("insert into message (from_uid,to_uid,msg) values (?,?,?)");
			ps.setString(1, m.getFrom());
			ps.setString(2, m.getTo());
			ps.setString(3, m.getMsg());
			
			status = ps.executeUpdate();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
		return status;
	}
	
	public List<message> getMessagesForUser(String email)
	{
		Connection con = Util.getconnect();
        List<message> messages = new ArrayList<>();
        
        try 
        {
			PreparedStatement ps = con.prepareStatement("select * from message where to_uid=?");
			ps.setString(1, email);
			
			ResultSet set = ps.executeQuery();
			while(set.next())
			{
				int mid = set.getInt(1);
				String from_uid = set.getString(2);
				String to_uid = set.getString(3);
				String msg = set.getString(4);
				
				message m = new message();
				m.setM_id(mid);
				m.setFrom(from_uid);
				m.setTo(to_uid);
				m.setMsg(msg);
				messages.add(m);
			}
		}
        catch (Exception e) 
        {
        	e.printStackTrace();
		}
        
        
        return messages;
    }
}
