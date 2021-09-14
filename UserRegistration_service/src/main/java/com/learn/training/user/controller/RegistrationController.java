package com.learn.training.user.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learn.training.user.model.User;
import com.learn.training.user.model.UserDto;
import com.learn.training.user.service.UserService;



@RestController
public class RegistrationController {
	private static final Logger logger = LoggerFactory.getLogger(RegistrationController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public ResponseEntity<User> signup(@RequestBody UserDto user) {
		
		User cust= userService.save(user);
		logger.info("Inside the signup method");
	return ResponseEntity.status(HttpStatus.CREATED).body(cust);
	}

}
