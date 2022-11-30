package com.ucwealth.springCrud.student;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
public class StudentService {
	private final StudentRepository studentRepository;
	@Autowired
	public StudentService(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	public List<Student> getStudents() {
		return studentRepository.findAll();
	}

	public void addNewStudent(Student student) {
		Optional<Student> studentOptional = studentRepository.findStudentByEmail(student.getEmail());
		if(studentOptional.isPresent()) {
			throw new IllegalStateException("User already exists!");
		}
		studentRepository.save(student);
	}

	public void deleteStudent(Long id) {
		boolean studentExists = studentRepository.existsById(id);
		if(!studentExists) {
			throw new IllegalStateException("This student doesnt exist");
		} else {
			studentRepository.deleteById(id);
		}
	}

	@Transactional
	public void updateStudent(Long studentId, Student student) {
		Student s = studentRepository.findById(studentId).orElseThrow(() -> new IllegalStateException("Student with id "+studentId+" does not exist"));
		String name = student.getName();
		String email = student.getEmail();
		LocalDate dob = student.getDob();
		if(name != null && name.length() > 0  && !(s.getName().equals(name))) {
			s.setName(name);
		}
		if(email != null && email.length() > 0 && !(s.getEmail().equals(email))) {
			Optional<Student> studentOptional = studentRepository.findStudentByEmail(email);
			if(studentOptional.isPresent()) {
				throw new IllegalStateException("This email is taken!");
			}
			s.setEmail(email);
		}
		if(dob != null && !(s.getDob().equals(dob))) {
			s.setDob(dob);
		}
	}
}
