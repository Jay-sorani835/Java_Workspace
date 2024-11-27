package com.model;

import java.util.List;

public class StudentManager 
{
    private List<Student> students;

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void displayStudents() 
    {
        for (Student student : students)
        {
            System.out.println(student);
        }
    }
}
