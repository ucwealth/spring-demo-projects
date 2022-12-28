package com.ucwealth.loginregistrationsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ucwealth.loginregistrationsystem.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
