package com.example.Room.service;


import com.example.Room.entity.Book;
import com.example.Room.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    @Autowired
    private BookRepository repository;
    //post method//

    public Book saveBook(Book book){
        return repository.save(book);
    }

    public List<Book> saveBook(List<Book> books){
        return repository.saveAll(books);
    }


    //get method//
    public List<Book> getBook(){
        return repository.findAll();
    }

    public Book getBookById(int id){
        return repository.findById(id).orElse(null);
    }

    public Book getBookByVaildtion(boolean isvailed){
        return repository.findByVailedtion(isvailed);
    }


    //delet method//

    public String deletBook(int id){
        repository.deleteById(id);
        return "Book removed !!!!"+ id;
    }


       //updata method//
    public Book updataBook(Book book){
        Book existingBook = repository.findById(book.getId()).orElse(null);
        existingBook.setVailed(book.getIsVailed());
        existingBook.setNameCustmor(book.getNameCustmor());
        return repository.save(existingBook);
    }
}
