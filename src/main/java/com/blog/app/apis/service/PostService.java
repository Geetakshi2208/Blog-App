package com.blog.app.apis.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.blog.app.apis.payload.PostDto;
import com.blog.app.apis.payload.PostResponse;

@Service
public interface PostService {
	
	PostDto createPost(PostDto postDto,Long userId,Integer categoryId);
	
	PostDto updatePost(PostDto postDto, Integer postId );
	
	void deletePost(Integer postId);
	
	PostResponse getAllPost(Integer pageNumber,Integer pageSize,String sortBy,String sortDir);
	
	PostDto getPostById(Integer postId);
	
	List<PostDto> getPostByCategory(Integer categoryId);
	
	List<PostDto> getPostByUser(Long userId);
	
	List<PostDto> searchPosts(String keyword);

}
