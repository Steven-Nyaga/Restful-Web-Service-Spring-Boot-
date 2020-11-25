/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nyaga.restful.repository;

import com.nyaga.restful.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Admin
 */
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
