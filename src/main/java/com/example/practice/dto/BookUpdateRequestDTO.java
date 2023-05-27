package com.example.practice.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

@Data
public class BookUpdateRequestDTO {
    
    @NotBlank
    private String bookTitle;

    // @NotBlank
    // private String authorName;

    private String description;
}
