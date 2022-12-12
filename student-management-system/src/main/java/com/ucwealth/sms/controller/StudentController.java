package com.ucwealth.sms.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.ucwealth.sms.entity.Student;
import com.ucwealth.sms.service.StudentService;

@Controller
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	// handler method to list students and return model and view
	
	@GetMapping("/students")
	public String listStudents(Model model) {
		model.addAttribute("students", studentService.getAllStudents());
		return "students";
	}
	
}
