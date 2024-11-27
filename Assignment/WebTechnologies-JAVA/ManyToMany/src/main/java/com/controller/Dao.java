package com.controller;


import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Reader;
import com.model.Subscription;

public class Dao {
	public void insert(Reader rd)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.save(rd);
		tr.commit();
		sess.close();
	}
	public static Reader view(int id)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		Reader rd = sess.get(Reader.class, id);
		return rd;
	}
	public void update(Reader rd)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.update(rd);
		tr.commit();
		sess.close();
	}
	public void delete(Reader rd)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.delete(rd);
		tr.commit();
		sess.close();
	}
}
