package com.example.Room.repository;

import com.example.Room.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BooksRepository extends JpaRepository<Book,Integer> {



    @Query(value ="SELECT * FROM  Book_table where is_vailed = ?1", nativeQuery=true)
    Book findByVailedtion(boolean isvailed);
}
