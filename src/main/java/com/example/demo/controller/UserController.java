package com.example.demo.controller;

import com.example.demo.payload.request.UserRequest;
import com.example.demo.payload.response.UserResponse;
import com.example.demo.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserServiceImp userServiceImp;

    @GetMapping("/{id}")
    public UserResponse getUserById(@PathVariable("id") Long id){
        return UserResponse.createDTO(userServiceImp.getUserById(id));
    }

    @GetMapping
    public List<UserResponse> getUserList(){
        return UserResponse.createDTOList(userServiceImp.getAllUSer());
    }

    @PutMapping
    public UserResponse updateUser(@RequestBody UserRequest userRequest){
        return UserResponse.createDTO(userServiceImp.updateUser(userRequest.updateEntity()));
    }

    @PostMapping
    public UserResponse addUser(@RequestBody UserRequest userRequest){
        return UserResponse.createDTO(userServiceImp.addUser(userRequest.createEntity()));
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable("id") Long id){
        userServiceImp.deleteUser(id);
    }

}
