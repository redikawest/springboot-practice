package com.example.practice.web;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StopWatch;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.practice.dto.BookDetailDTO;
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
}

/**
 * 
 * Note.
 * @AllArgsConstructor itu sama saja seperti constructor
 * 
 */
