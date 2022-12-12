package com.ucwealth.sms;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ucwealth.sms.entity.Student;
import com.ucwealth.sms.repository.StudentRepository;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(StudentManagementSystemApplication.class, args);
	}
	
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void run(String... args) throws Exception {
//		Student student1 = new Student("Peace", "Monday", "peace.monday@gmail.com");
//		studentRepository.save(student1);
//		
//		Student student2 = new Student("George", "Monday", "george.monday@gmail.com");
//		studentRepository.save(student2);
//		
//		Student student3 = new Student("Tony", "Stark", "tony.stark@gmail.com");
//		studentRepository.save(student3);
	}

}
