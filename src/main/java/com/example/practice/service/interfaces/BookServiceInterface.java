package com.example.practice.service.interfaces;

import java.util.List;

import com.example.practice.dto.BookCreateDTO;
import com.example.practice.dto.BookDetailDTO;
import com.example.practice.dto.BookUpdateRequestDTO;

public interface BookServiceInterface {
    
    public BookDetailDTO findBookDetailById(Long bookId);

    public List<BookDetailDTO> findBookListDetail();

    public void createNewBook(BookCreateDTO dto);

    public void updateBook(Long bookId, BookUpdateRequestDTO dto);

    public void deleteBook(Long bookId);
}
