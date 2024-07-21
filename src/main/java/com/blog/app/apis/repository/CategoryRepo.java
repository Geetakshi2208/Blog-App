package com.blog.app.apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blog.app.apis.entities.Category;

@Repository
public interface CategoryRepo extends JpaRepository<Category,Integer>{

}
