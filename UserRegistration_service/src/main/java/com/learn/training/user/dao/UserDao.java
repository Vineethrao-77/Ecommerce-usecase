package com.learn.training.user.dao;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learn.training.user.model.User;

@Repository
public interface UserDao extends CrudRepository<User, Integer> {

    User findByUserName(String userName);
   // UserDto findByUsername(String username)
}
