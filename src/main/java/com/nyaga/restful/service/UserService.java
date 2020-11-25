/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaga.restful.service;

import com.nyaga.restful.model.User;
import com.nyaga.restful.repository.UserRepository;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Admin
 */
@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List <User> listAllUser(){
        return userRepository.findAll();
    }
    public void saveUser(User user) {
        userRepository.save(user);
    }
    public User getUser(Integer id){
        return userRepository.findById(id).get();
    }
    public void deleteUser(Integer id) {
        userRepository.deleteById(id);
    }
}
