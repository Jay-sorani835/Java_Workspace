package com.dao;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.connect.Util;
import com.model.Cart;
import com.model.Items;

public class Dao 
{
	public static void insert(Cart c)
	{
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		sess.save(c);
		tr.commit();
		sess.close();
	}
	public static void update()
	{
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		
		
		tr.commit();
		sess.close();
	}
	public static void updateItem(Items item, int id)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		Items i = sess.get(Items.class, id);
		i.setItemTotal(item.getItemTotal());
		i.setQuantity(item.getQuantity());
		sess.update(i);
		tr.commit();
		sess.close();
	}
	public Cart getCart(int id)
	{
		Session sess =  new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		Cart s = sess.get(Cart.class, id);
		tr.commit();
		return s;
	}
	
	public List<Cart> getCart() {
		
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		List<Cart> it = sess.createQuery("from cart").list();
		return it;
    }
	public Items getItems(int id)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		Items item = sess.get(Items.class, id);
		return item;
	}
	public static void deleteItems(int id)
	{
		Session sess = new Util().getConnect();
		Transaction tr = sess.beginTransaction();
		Items item = sess.get(Items.class, id);
		sess.delete(item);
		tr.commit();
		sess.close();
	}
}
