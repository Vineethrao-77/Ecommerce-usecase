package com.learn.training.user.service;



import java.util.List;

import org.springframework.http.ResponseEntity;

import com.learn.training.user.model.User;
import com.learn.training.user.model.UserDto;

public interface UserService {

    User save(UserDto user);
    List<User> findAll();
    void delete(int id);

    User findOne(String username);

    User findById(int id);

    UserDto update(UserDto userDto);
	UserDto findByUsername(String username);
}
