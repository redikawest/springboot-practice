package com.example.practice.web;

import java.net.URI;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.AuthorCreateRequestDTO;
import com.example.practice.dto.AuthorResponseDTO;
import com.example.practice.service.logic.AuthorService;

import jakarta.validation.Valid;
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

    @PostMapping("/author")
    public ResponseEntity<Void> createNewAuthor(@RequestBody @Valid AuthorCreateRequestDTO dto)
    {
        authorService.createNewAuthor(dto);
        return ResponseEntity.created(URI.create("/author")).build();
    }
}
