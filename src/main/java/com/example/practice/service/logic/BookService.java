package com.example.practice.service.logic;

import org.springframework.stereotype.Service;

import com.example.practice.domain.Book;
import com.example.practice.dto.BookDetailDTO;
import com.example.practice.repository.logic.BookRepository;
import com.example.practice.service.interfaces.BookServiceInterface;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service("bookService")
public class BookService implements BookServiceInterface 
{
    private final BookRepository bookLogic;

    @Override
    public BookDetailDTO findBookDetailById(Long bookId) {
        Book book = bookLogic.findBookById(bookId);
        BookDetailDTO dto = new BookDetailDTO();
        dto.setBookId(book.getId());
        dto.setAuthorName(book.getAuthor().getName());
        dto.setBookTitle(book.getTitle());
        dto.setBookDescription(book.getDescription());
        return dto;
    }
    
}
