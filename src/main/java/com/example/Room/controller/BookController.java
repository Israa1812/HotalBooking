package com.example.Room.controller;


import com.example.Room.entity.Book;
import com.example.Room.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService service;

    @PostMapping("/addBook")
    public Book addBook(@RequestBody Book book){
        return service.saveBook(book);
    }

    @PostMapping("/addBooks")
    public List<Book> addBooks(@RequestBody  List<Book> books){
        return service.saveBook(books);
    }
    @GetMapping("/Books")
    public List<Book> findAllBook(){
        return service.getBook();
    }
    @GetMapping("/Books/{id}")
    public Book findBookById( @PathVariable int id){
        return service.getBookById(id);
    }
    @GetMapping("/Books/{isVailed}")
    public Book findBookByVailedtion( @PathVariable boolean isvailed){
        return service.getBookByVaildtion(isvailed);
    }

    @PutMapping("/updata")
    public Book updataBook( @RequestBody  Book book){
        return service.updataBook(book);
    }

    @DeleteMapping("/delete/{id}")
    public String  deletBook(@PathVariable int id){
        return service.deletBook(id);
    }
}
