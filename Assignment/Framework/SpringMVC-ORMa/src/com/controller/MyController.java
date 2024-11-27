
package com.controller;


import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bo.BO;
import com.model.User;

@Controller
public class MyController 
{
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String index()
	{
		return "index";
	}
	
	@RequestMapping(value="/back", method = RequestMethod.GET)
	public String back()
	{
		return "index";
	}
	
	@RequestMapping(value="/insert" , method = RequestMethod.POST)
	public String insert(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		User u = new User();
		u.setName(request.getParameter("name"));
		u.setEmail(request.getParameter("email"));
		u.setFramework(request.getParameter("framework"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		BO bo = (BO) acm.getBean("bo");
		bo.insertdata(u);
		
		return "index";
	}
	
	
	@RequestMapping(value="/edit",method =RequestMethod.POST)
	public String edit(HttpServletRequest req, HttpServletResponse resp,ModelMap map )
	{
		int id=Integer.parseInt(req.getParameter("id"));
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		BO bo = (BO) acm.getBean("bo");
		User u = bo.getUserById(id);
		map.addAttribute("temp", u);//key,value
		return "update";
	}
	
	@RequestMapping(value="/view",method = RequestMethod.POST)
	public String view(HttpServletRequest req, HttpServletResponse resp, ModelMap map) throws IOException
	{
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		BO bo = (BO) acm.getBean("bo");
		return "view";
	
	}
	@RequestMapping(value="/update" , method = RequestMethod.POST)
	public String update(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		User u = new User();
		int id=Integer.parseInt(request.getParameter("id"));
		u.setId(id);
		u.setName(request.getParameter("editname"));
		u.setEmail(request.getParameter("editemail"));
		u.setFramework(request.getParameter("editframework"));
		
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		BO bo = (BO) acm.getBean("bo");
		bo.updatedata(u);
		
		return "index";
	}
	
	@RequestMapping(value="/delete" , method = RequestMethod.POST)
	public String delete(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		User u = new User();
		String id = request.getParameter("id");
		int id2 = Integer.parseInt(id);
		
		u.setId(id2);
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		BO bo = (BO) acm.getBean("bo");
		bo.deletedata(u);
		
		return "index";
	}
	@RequestMapping(value="/deleteAll" , method = RequestMethod.POST)
	public String deleteAll(HttpServletRequest request,HttpServletResponse response,ModelMap map)
	{
		ApplicationContext acm = new ClassPathXmlApplicationContext("Beans.xml");
		
		BO bo = (BO) acm.getBean("bo");
		bo.deleteAll();
		
		return "index";
	}
	
}
