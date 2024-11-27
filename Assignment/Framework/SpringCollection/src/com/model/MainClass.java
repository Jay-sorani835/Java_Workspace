package com.model;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass 
{
    public static void main(String[] args) 
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        StudentManager studentManager = (StudentManager) context.getBean("studentManager");

        studentManager.displayStudents();
    }
}
