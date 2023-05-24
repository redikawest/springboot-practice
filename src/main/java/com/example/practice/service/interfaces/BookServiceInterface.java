package com.example.practice.service.interfaces;

import com.example.practice.dto.BookDetailDTO;

public interface BookServiceInterface {
    
    public BookDetailDTO findBookDetailById(Long bookId);
}
