package com.example.practice.repository.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.example.practice.domain.Book;
import com.example.practice.repository.interfaces.BookInterface;

import lombok.Data;

@Data
public class BookRepository implements BookInterface 
{

    private Map<Long, Book> bookMap;

    @Override
    public Book findBookById(Long id) {
        Book book = bookMap.get(id);
		return book;
    }

    @Override
    public List<Book> findAll() {
        List<Book> bookList = new ArrayList<Book>(bookMap.values());
        return bookList;
    }

    
    
}
