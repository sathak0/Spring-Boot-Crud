package com.example.demo.service;

import com.example.demo.dao.UserRepository;
import com.example.demo.model.User;
import jakarta.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UserServiceImp {

    @Autowired
    private UserRepository userRepository;

    public User addUser(User user){
        return userRepository.save(user);
    }

    public User updateUser(User user){
        return userRepository.save(user);
    }

    public void deleteUser(Long id){
        userRepository.delete(userRepository.getById(id));
    }

    public User getUserById(Long id){
        return userRepository.getById(id);
    }

    public List<User> getAllUSer(){
        return userRepository.findAll();
    }
}
