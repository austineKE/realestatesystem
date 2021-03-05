package com.project.v1.realestatesystem.controller;

import com.project.v1.realestatesystem.model.Users;
import com.project.v1.realestatesystem.service.AllUsers_service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RestController("/api/v1")
public class Users_controller {

    @Autowired
    private AllUsers_service users_service;


    @GetMapping("/users")
    public List<Users> getAllUsers(){
        return users_service.findAll();
    }
}
