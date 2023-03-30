package com.Damera;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.Damera.entities.Student;
import com.Damera.repositories.StudentRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt = SpringApplication.run(Application.class, args);
		StudentRepository bean = ctxt.getBean(StudentRepository.class);
		
		/*
		bean.saveStudent(101,"Saathvik","male",21,550);
		System.out.println("Student details inserted...");
		*/
		
		/*
		bean.updateStudent(550,101);
		System.out.println("Student details updated");
		*/
		
		bean.deleteStudent(101);
		System.out.println("Student details deleted...");
	
	
	}

}
