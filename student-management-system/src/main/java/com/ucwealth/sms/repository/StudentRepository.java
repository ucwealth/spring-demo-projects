package com.ucwealth.sms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ucwealth.sms.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
	

}
