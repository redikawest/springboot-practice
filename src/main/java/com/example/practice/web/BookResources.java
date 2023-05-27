package com.example.practice.web;

import java.net.URI;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.BookCreateDTO;
import com.example.practice.dto.BookDetailDTO;
import com.example.practice.dto.BookUpdateRequestDTO;
import com.example.practice.service.logic.BookService;


// @AllArgsConstructor
@RestController
public class BookResources {

    Logger log = LoggerFactory.getLogger(BookResources.class);
    
    private final BookService bookService;

    public BookResources(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/book/{bookId}")
    public BookDetailDTO findBookById(@PathVariable("bookId") Long id) {

        StopWatch stopWatch = new StopWatch();
        log.info("start find book detail "+ id);

        stopWatch.start();

        BookDetailDTO result = bookService.findBookDetailById(id);

        log.info("finish fing book detail "+ stopWatch.getTaskCount());

        return result;
    }

    @PostMapping("/book")
    public ResponseEntity<Void> createNewBook(@RequestBody BookCreateDTO dto)
    {
        bookService.createNewBook(dto);
        return ResponseEntity.created(URI.create("/book")).build();
    }

    @GetMapping("/book")
    public ResponseEntity<List<BookDetailDTO>> findBookList()
    {
        return ResponseEntity.ok().body(bookService.findBookListDetail());
    }

    @PutMapping("/book/{bookId}")
    public ResponseEntity<Void> updateBook(@PathVariable("bookId") Long bookId, @RequestBody BookUpdateRequestDTO dto)
    {
        bookService.updateBook(bookId, dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable("bookId") Long bookId)
    {
        bookService.deleteBook(bookId);
        return ResponseEntity.ok().build();
    }
}
 
/**
 * 
 * Note.
 * @AllArgsConstructor itu sama saja seperti constructor
 * 
 */
