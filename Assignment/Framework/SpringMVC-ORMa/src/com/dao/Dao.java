package com.dao;

import java.util.List;

import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.model.User;

public class Dao extends HibernateDaoSupport
{

		public void insertData(User p)
		{
			this.getHibernateTemplate().save(p);
		}
		
		public List<User>viewdetails()
		{
			return getHibernateTemplate().find("from User");
		}
		
		public void update(User p)
		{
			this.getHibernateTemplate().update(p);
		}
		
		public void delete(User p)
		{
			this.getHibernateTemplate().delete(p);
		}
		
		public User getUserById(int id)
		{
				HibernateTemplate template=getHibernateTemplate();
				User p=template.get(User.class,id);
				return p;
		}
		public void deleteAll()
		{
			List<User> viewdetails = getHibernateTemplate().find("from user");
			this.getHibernateTemplate().deleteAll(viewdetails);
		}
}
