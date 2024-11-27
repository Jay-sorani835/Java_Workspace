package com.bo;

import java.util.List;

import com.dao.Dao;
import com.model.Admin;
import com.model.User;

public class Bo 
{
	Dao dao;

	public Dao getDao() 
	{
		return dao;
	}

	public void setDao(Dao dao) 
	{
		this.dao = dao;
	}
	
	public int Insert(User u)
	{
		int id = dao.Insert(u);
		return id;
	}
	public void Update(User u)
	{
		dao.Update(u);
	}
	public void Delete(User u)
	{
		dao.Delete(u);
	}
	public List<User> getall()
	{
		List<User> getlist = dao.getall();
		return getlist;
	}
	public User getSingle(String email)
	{
		User u1 = dao.getSingle(email);
		return u1;
	}
	public Admin getAdmin(Admin a)
	{
		Admin admin = dao.getAdmin(a);
		return admin;
	}
}
