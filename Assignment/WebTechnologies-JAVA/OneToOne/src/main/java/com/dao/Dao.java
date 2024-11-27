package com.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.model.*;
import com.connect.*;
public class Dao 
{
	public static void insert(Address a, student s)
	{
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.save(a);
		sess.save(s);
		tr.commit();
		sess.close();
	}
	public static void update(Address a, student s, int id)
	{
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		
		student s1 = sess.get(student.class, id);
		Address a1 = sess.get(Address.class, s1.getAddress().getId());
		
		a1.setStreet(a.getStreet());
		a1.setState(a.getState());
		a1.setCity(a.getCity());
		a1.setZip_code(a.getZip_code());
		s1.setName(s.getName());
		
		sess.update(a1);
		sess.update(s1);
		tr.commit();
		sess.close();
	}
	public student getStudent(int id)
	{
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		student s = sess.get(student.class, id);
		tr.commit();
		return s;
	}
	
	public List<student> getAllStudents() {
		
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		List<student> s = sess.createQuery("from student").list();
		return s;
    }
	public static void deleteStudent(int id)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		student s = sess.get(student.class, id);
		Address a = sess.get(Address.class, s.getAddress().getId());
		if(s != null && a!= null)
		{
			sess.delete(s);
			sess.delete(a);
		}
		System.out.println(s);
		System.out.println(a);
		tr.commit();
		sess.close();
	}
}
