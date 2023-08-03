package com.blogapi.payload;

import lombok.Data;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
public class PostDto {

    private Long id;

    @NotEmpty
    @Size(min=2,message = "Title Should be at least two characters")
    private String title;

    @NotEmpty(message = "Should not be empty")
    @Size(min=4)
    private String description;

    @NotEmpty(message = "content is empty")
    private String content;
}
