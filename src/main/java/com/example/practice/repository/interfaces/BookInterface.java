package com.example.practice.repository.interfaces;

import java.util.List;

import com.example.practice.domain.Book;

public interface BookInterface {
    
    public Book findBookById(Long id);

    public List<Book> findAll();

    public void save(Book book);

    public void update(Book book);

    public void delete(Long bookId);
}
