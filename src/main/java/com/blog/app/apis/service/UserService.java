package com.blog.app.apis.service;

import java.util.List;

import com.blog.app.apis.payload.UserDto;

public interface UserService {
	
	UserDto registerNewUser(UserDto user);
	
	UserDto createUser(UserDto userDto);
	
	UserDto updateUser(UserDto userDto,Long id);
	
	UserDto getUserById(Long id);
	
	void deleteUser(Long id);
	
	List<UserDto> getAllUsers();
	

}
