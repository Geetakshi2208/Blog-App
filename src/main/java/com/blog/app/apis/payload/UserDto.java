package com.blog.app.apis.payload;

import java.util.HashSet;
import java.util.Set;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class UserDto {

	private Long id;
    
	@NotEmpty
	@Size(min=3,message="Username must be of at least 3 characters")
	private String name;

	@Email
	private String email;

	
	@NotEmpty
	@Size(min=3,max=10,message="Password must be of at least 3 chars and max of 10 chars")
	private String password;

	@NotEmpty
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();

}
