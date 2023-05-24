package com.example.practice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.BookDetailDTO;
import com.example.practice.service.logic.BookService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class BookResources {
    
    private final BookService bookService;

    @GetMapping("/book/{bookId}")
    public BookDetailDTO findBookById(@PathVariable("bookId") Long id) {
        return bookService.findBookDetailById(id);
    }
}
