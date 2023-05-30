package com.example.practice.repository.logic;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.practice.domain.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> 
{
    public Optional<Author> findById(Long id);

    public List<Author> findByName(String authorName);
}
