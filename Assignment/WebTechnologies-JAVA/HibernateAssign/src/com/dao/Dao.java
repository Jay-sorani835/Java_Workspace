package com.dao;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;

import com.connect.Util;
import com.model.User;

public class Dao 
{
	public void insert(User u)
	{
		Session session = new Util().getconnect();
		Transaction tr = session.beginTransaction();
		session.save(u);
		tr.commit();
		session.close();
	}
}
