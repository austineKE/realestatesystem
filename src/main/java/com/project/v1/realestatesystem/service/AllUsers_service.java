package com.project.v1.realestatesystem.service;

import com.project.v1.realestatesystem.interfaces.User_interface;
import com.project.v1.realestatesystem.model.Users;
import com.project.v1.realestatesystem.repository.AllUser_repo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AllUsers_service implements User_interface {

    @Autowired
    private AllUser_repo user_repo;

    @Override
    public List<Users> findAll() {
        return  user_repo.findAll();
    }
}
