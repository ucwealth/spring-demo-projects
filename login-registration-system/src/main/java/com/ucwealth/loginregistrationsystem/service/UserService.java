package com.ucwealth.loginregistrationsystem.service;

import com.ucwealth.loginregistrationsystem.model.User;
import com.ucwealth.loginregistrationsystem.web.dto.UserRegistrationDto;

public interface UserService {
	User save(UserRegistrationDto registrationDto);

}
