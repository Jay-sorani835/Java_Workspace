
package com.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.Admin;
import com.model.User;

public class Dao extends HibernateDaoSupport {

	public int Insert(User u)
	{
		int id = (int) this.getHibernateTemplate().save(u);
		return id;
	}
//	
	public void Update(User u)
	{
		this.getHibernateTemplate().update(u);
	}

	public void Delete(User u)
	{
		this.getHibernateTemplate().delete(u);
	}
	public List<User> getall()
	{
		List<User> getlist = this.getHibernateTemplate().find("from User");
		return getlist;
	}
	public User getSingle(String email)
	{
		List<User> user = (List<User>) this.getHibernateTemplate().find("from User where UEMAIL = ?" , email);
		return user.isEmpty() ? null : user.get(0);
	}
	public Admin getAdmin(Admin a)
	{	
		List<Admin> admin = (List<Admin>) this.getHibernateTemplate().find("from Admin where email = ?", a.getEmail());
        return admin.isEmpty() ? null : admin.get(0);
	}
}
