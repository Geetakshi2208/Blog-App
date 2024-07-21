package com.blog.app.apis.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.blog.app.apis.entities.Category;
import com.blog.app.apis.entities.Post;
import com.blog.app.apis.entities.User;
import com.blog.app.apis.payload.PostDto;
@Repository
public interface PostRepo extends JpaRepository<Post,Integer>{
	
	List<Post> findByUser(User user);
	List<Post> findByCategory(Category category);
	
	@Query("select p from Post p where p.title like :key")
	List<Post> searchPosts(@Param("key")String keyword);

}
