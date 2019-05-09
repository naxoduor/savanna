/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.movies.operations.service;

/**
 *
 * @author maradona
 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import com.movies.operations.models.User;

import com.movies.operations.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
    
    @Autowired
    UserRepository userRepository;
    
    @Override
    public void registerUser(User user) {
        userRepository.save(user);
    }

}
