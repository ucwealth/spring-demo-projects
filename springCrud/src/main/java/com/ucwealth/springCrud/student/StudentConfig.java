package com.ucwealth.springCrud.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

@Configuration
public class StudentConfig {
   @Bean
   CommandLineRunner commandLineRunner(StudentRepository repository) {
      return args -> {
         Student jose = new Student(
                 "Jose",
                 "josemourinho@gmail.com",
                 LocalDate.of(2000, 10, 21)
         );

         Student maria = new Student(
                 "Maria",
                 "maria.faani@gmail.com",
                 LocalDate.of(1997, 04, 01)
         );

         repository.saveAll(
                 List.of(jose, maria)
         );

      };
   }
}
