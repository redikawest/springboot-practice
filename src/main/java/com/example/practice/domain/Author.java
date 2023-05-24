package com.example.practice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Author
{
    
    private Long id;
    private String name;
    private Long birthDate;

}
