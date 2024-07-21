package com.blog.app.apis.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	@NotBlank
	@Size(min=3,message="categoryTitle must be of at least 3 characters")
	private String categoryTitle;
	@NotBlank
	@Size(min=10,message="categoryDescription must be of at least 10 characters")
	private String categoryDescription;

}
