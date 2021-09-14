package com.learn.training.user.controller;


import java.util.List;

import javax.ws.rs.Path;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learn.training.user.model.ApiResponse;
import com.learn.training.user.model.User;
import com.learn.training.user.model.UserDto;
import com.learn.training.user.service.UserService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/users")
public class UserController {
	private static final Logger logger = LoggerFactory.getLogger(UserController.class);


    @Autowired
    private UserService userService;
    
    @PostMapping
    public ApiResponse<User> saveUser(@RequestBody UserDto user){
    	logger.info("inside the user fetching method");
        return new ApiResponse<>(HttpStatus.OK.value(), "User saved successfully.",userService.save(user));
    }

    @GetMapping("/getAll")
    public ApiResponse<List<User>> listUser(){
        return new ApiResponse<>(HttpStatus.OK.value(), "User list fetched successfully.",userService.findAll());
    }
//    @GetMapping("/getAll")
//    public ResponseEntity<List<User>> listUser(){
//    	User user=(User) userService.findAll();
//		return ResponseEntity.status(HttpStatus.OK).body(user);
//    }
    
    @GetMapping("/username")
	public ResponseEntity<UserDto> getuserdetails(@PathVariable String userName) {
		UserDto user=userService.findByUsername(userName);
		return ResponseEntity.status(HttpStatus.OK).body(user);
	}
    

    @GetMapping("/{id}")
    @PreAuthorize("hasRole('ROLE_USER')")
    public ApiResponse<User> getOne(@PathVariable int id){
        return new ApiResponse<>(HttpStatus.OK.value(), "User fetched successfully.",userService.findById(id));
    }

    @PutMapping("/{id}")
    public ApiResponse<UserDto> update(@RequestBody UserDto userDto) {
        return new ApiResponse<>(HttpStatus.OK.value(), "User updated successfully.",userService.update(userDto));
    }

    @DeleteMapping("/{id}")
    public ApiResponse<Void> delete(@PathVariable int id) {
        userService.delete(id);
        return new ApiResponse<>(HttpStatus.OK.value(), "User deleted successfully.", null);
    }



}
