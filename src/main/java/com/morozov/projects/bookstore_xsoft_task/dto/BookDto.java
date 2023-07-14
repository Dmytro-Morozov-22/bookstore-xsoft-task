package com.morozov.projects.bookstore_xsoft_task.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.Data;

@Data
public class BookDto {
    private Long id;

    @NotEmpty(message = "Please enter valid name")
    private String name;

    @NotEmpty(message = "Please enter valid author")
    private String author;

    @NotEmpty(message = "Please enter valid description")
    private String description;

    @NotEmpty(message = "Please select category")
    private String category;
}
