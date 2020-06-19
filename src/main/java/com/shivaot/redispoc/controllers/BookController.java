package com.shivaot.redispoc.controllers;

import com.shivaot.redispoc.model.Book;
import com.shivaot.redispoc.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @GetMapping("add/{id}/{name}/{author}")
    public Book add(@PathVariable("id") final String id, @PathVariable("name") final String name,@PathVariable("author") final String author) {
        bookRepository.save(new Book(id,name,author));
        return bookRepository.findById(id).get();
    }

    @GetMapping("update/{id}/{name}/{author}")
    public Book update(@PathVariable("id") final String id, @PathVariable("name") final String name,@PathVariable("author") final String author) {
        bookRepository.save(new Book(id,name,author));
        return bookRepository.findById(id).get();
    }

    @GetMapping("/all")
    public Iterable<Book> all() {
        return bookRepository.findAll();
    }

    @GetMapping("/delete/{id}")
    public Iterable<Book> deleteById(@PathVariable("id") String id) {
        bookRepository.deleteById(id);
        return all();
    }

    @GetMapping("/{id}")
    public Book findById(@PathVariable String id) {
       return bookRepository.findById(id).get();
    }

}
