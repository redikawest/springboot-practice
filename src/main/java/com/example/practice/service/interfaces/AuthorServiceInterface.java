package com.example.practice.service.interfaces;

import com.example.practice.dto.AuthorCreateRequestDTO;
import com.example.practice.dto.AuthorResponseDTO;

public interface AuthorServiceInterface 
{
    public AuthorResponseDTO findAuthorById(Long id);

    public void createNewAuthor(AuthorCreateRequestDTO dto);
}
