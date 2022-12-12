package com.ucwealth.sms.service;

import java.util.List;

import com.ucwealth.sms.entity.Student;

public interface StudentService {
	List<Student> getAllStudents();

	Student saveStudent(Student student);

}
