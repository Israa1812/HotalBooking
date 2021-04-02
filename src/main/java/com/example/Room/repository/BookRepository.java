package com.example.Room.repository;

import com.example.Room.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BookRepository extends JpaRepository<Book,Integer> {
    Book findByVailedtion(boolean isvailed);
}
