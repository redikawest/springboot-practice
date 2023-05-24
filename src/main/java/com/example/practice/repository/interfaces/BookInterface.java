package com.example.practice.repository.interfaces;

import com.example.practice.domain.Book;

public interface BookInterface {
    
    public Book findBookById(Long id);
}
