package com.blog.app.apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.app.apis.entities.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role,Integer>{

}
