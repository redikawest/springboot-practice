package com.example.practice.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.AuthorResponseDTO;
import com.example.practice.service.logic.AuthorService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class AuthorResource {
    
    private final AuthorService authorService;

    @GetMapping("/author/{id}/detail")
    public ResponseEntity<AuthorResponseDTO> findAuthorById(@PathVariable Long id)
    {
        return ResponseEntity.ok().body(authorService.findAuthorById(id));
    }
}
