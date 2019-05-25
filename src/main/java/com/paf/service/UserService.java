package com.paf.service;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.paf.model.UserData;
import com.paf.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;
	
	
	@Transactional
	public String registerUser(UserData userValues) {
		
		if (userValues.getEmailId()!= null && userValues.getPass() != null && userValues.getUserName() != null) {
			if (userRepository.findByEmailId(userValues.getEmailId()) == null) {
				userRepository.saveAndFlush(userValues);
				return "Success";
			}
			
		}
		return "Email Already Registered";
		
	}
	
	public String validateCredentials(UserData userValues) {
		UserData responseUser = new UserData();
		if (userValues.getEmailId() != null && userValues.getPass() != null) {
			responseUser = userRepository.findByEmailId(userValues.getEmailId());
			if (responseUser != null) {
				if (responseUser.getPass().equals(userValues.getPass())) {
					return "Success";
				}
			}
		}
		return "Failed";
	}
	
	@Transactional
	public String resetPassword(UserData userValues) {
		if (userValues.getEmailId() != null && userValues.getPass() != null) {
			
			UserData responseUser = userRepository.findByEmailId(userValues.getEmailId());
			if (responseUser != null) {
				responseUser.setPass(userValues.getPass());
				userRepository.saveAndFlush(responseUser);
				return "Password changed";
			} else {
				return "user not registered";
			}
			
		}
		return "Data Error";
	}
}
