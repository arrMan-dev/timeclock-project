package net.arrisdev.springboot.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import net.arrisdev.springboot.dto.UserRegistrationDto;
import net.arrisdev.springboot.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
