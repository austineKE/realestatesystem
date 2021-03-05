package com.project.v1.realestatesystem.repository;

import com.project.v1.realestatesystem.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AllUser_repo extends JpaRepository<Users, Integer> {
}
