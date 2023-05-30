package com.example.practice.service.logic;

import org.springframework.stereotype.Service;

import com.example.practice.domain.Author;
import com.example.practice.dto.AuthorResponseDTO;
import com.example.practice.exception.BadRequestException;
import com.example.practice.repository.logic.AuthorRepository;
import com.example.practice.service.interfaces.AuthorServiceInterface;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class AuthorService implements AuthorServiceInterface
{

    private final AuthorRepository authorRepository;

    @Override
    public AuthorResponseDTO findAuthorById(Long id) {
        Author author = authorRepository.findById(id).orElseThrow(()->new BadRequestException("invalid authorId"));
        
        AuthorResponseDTO dto = new AuthorResponseDTO();
        dto.setAuthorName(author.getName());
        dto.setBirthDate(author.getBirthDate());
        return dto;
    }
    
}
