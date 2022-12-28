package com.ucwealth.loginregistrationsystem.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ucwealth.loginregistrationsystem.model.User;
import com.ucwealth.loginregistrationsystem.web.dto.UserRegistrationDto;

public interface UserService extends UserDetailsService {
	User save(UserRegistrationDto registrationDto);

}
