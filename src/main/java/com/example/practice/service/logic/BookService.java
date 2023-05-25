package com.example.practice.service.logic;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

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

    @Override
    public List<BookDetailDTO> findBookListDetail() {
        List<Book> books = bookLogic.findAll();
        return books.stream().map((b) -> {
            BookDetailDTO dto = new BookDetailDTO();
            dto.setAuthorName(b.getAuthor().getName());
            dto.setBookDescription(b.getDescription());
            dto.setBookId(b.getId());
            dto.setBookTitle(b.getTitle());
            return dto;
        }).collect(Collectors.toList());
    }

    
    
}
