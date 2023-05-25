package com.example.practice.service.interfaces;

import java.util.List;

import com.example.practice.dto.BookDetailDTO;

public interface BookServiceInterface {
    
    public BookDetailDTO findBookDetailById(Long bookId);

    public List<BookDetailDTO> findBookListDetail();
}
