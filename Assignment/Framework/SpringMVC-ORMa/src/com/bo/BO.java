package com.bo;

import java.util.List;

import com.dao.Dao;
import com.model.User;

public class BO
{
	Dao dao;

	public Dao getDao() {
		return dao;
	}

	public void setDao(Dao dao) {
		this.dao = dao;
	}
	
	public void insertdata(User p)
	{
		dao.insertData(p);
	}
	
	public List<User>viewdetails()
	{
		return dao.viewdetails();
	}
	
	public void updatedata(User p)
	{
		 dao.update(p);
	}
	
	public void deletedata(User p)
	{
		dao.delete(p);
	}
	public User getUserById(int id)
	{
		return dao.getUserById(id);
	}
	public void deleteAll()
	{
		dao.deleteAll();
	}
}