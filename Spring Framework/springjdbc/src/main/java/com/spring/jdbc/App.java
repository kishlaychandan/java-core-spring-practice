package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entities.Student;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "My prgram started bro..." );
        
//        ApplicationContext context=new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context=new AnnotationConfigApplicationContext(jdbcConfig.class);

        StudentDao studentDao = context.getBean("studentDao",StudentDao.class);
        
//        Insert
//        Student student=new Student();
//        student.setId(287);
//        student.setName("chandan");
//        student.setCity("Buxar");
        
//        int result = studentDao.insert(student);
//         System.out.println("Student added : "+result);
        
        
//        Update
//        Student student =new Student();
//        student.setId(201);
//        student.setName("krishna");
//        student.setCity("Bangalore");
//        int result=studentDao.change(student);
//        System.out.print("data changed : "+result);
        
        
//        delete
//        int result=studentDao.delete(201);
//        System.out.println("deleted"+result);
        
        
//        select single data
//        Student student=studentDao.getStudent(222);
//        System.out.println("selected : "+student);       
//    
    
    //select all data
        List<Student> students = studentDao.getAllStudents();
//        System.out.println(student+"/////////");
        for(Student s:students) {
        System.out.println(s);
        }
    }
}
