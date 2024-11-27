
package com.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bo.Bo;
import com.model.User;

public class MainClass {
	public static void register(User u)
	{
		ApplicationContext con = new ClassPathXmlApplicationContext("beans.xml");
		Bo bo = (Bo) con.getBean("bo");
		bo.Insert(u);
	}
//public static void main(String[] args) 
//{
//	ApplicationContext con = new ClassPathXmlApplicationContext("beans"
//			+ ".xml");
//
//	Scanner sc = new Scanner(System.in);
//	Bo bo = (Bo) con.getBean("bo");
//	User p  =  (User) con.getBean("model");
	
//	 Insert OP
//	
//	 System.out.println("Enter name:");
//	 p.setName(sc.next());
//	 bo.Insert(p);
	
	//update op
//	System.out.println("Enter the id : ");
//	int id = sc.nextInt();
//	
//	System.out.println("Enter the name : ");
//	String name = sc.next();
//	
//	p.setId(id);
//	p.setName(name);
//	
//	bo.Update(p);
	
	//delete op
	
//	System.out.println("Enter the id : ");
//	int id = sc.nextInt();
//	p.setId(id);
//	bo.Delete(p);
	
	//select op
	
//	List<Person>list = bo.getall();
//	
//	for(Person person : list)
//	{
//			System.out.println(person.getId()+"\t|\t"+person.getName());
//	}
	
	//select one
//	
//	System.out.println("Enter the id : ");
//	int id = sc.nextInt();
//	p.setU_id(id);
//	User p1 = bo.getSingle(p);
//	System.out.println(p1.getFirstname());
//	}
}
