package com.example.practice.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.practice.dto.BookDetailDTO;
import com.example.practice.service.logic.BookService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Controller
public class BookController {

    private final BookService bookService;
    
    @GetMapping("/book")
    public String findBookList(Model model) {
        List<BookDetailDTO> books = bookService.findBookListDetail();
        model.addAttribute("books", books);
        return "book/list";
    }
}
