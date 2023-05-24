package com.example.practice.dto;

import java.io.Serializable;
import lombok.Data;

@Data
public class BookDetailDTO implements Serializable {

    private Long bookId;
    private String authorName;
    private String bookTitle;
    private String bookDescription;
}
