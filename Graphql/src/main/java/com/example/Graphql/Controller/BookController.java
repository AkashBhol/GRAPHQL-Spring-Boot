package com.example.Graphql.Controller;

import com.example.Graphql.Model.Author;
import com.example.Graphql.Model.Book;
import com.example.Graphql.Repository.AuthorRepository;
import com.example.Graphql.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private BookRepository bookRepository;

    @QueryMapping
    public Book bookById(@Autowired int id){
        Book book = bookRepository.findById(id).orElseThrow(null);
        return  book;
    }

    @QueryMapping
    public List<Author> allAuthors() {
        return authorRepository.findAll();
    }

    @QueryMapping
    public List<Book> allBooks() {
        return bookRepository.findAll();
    }

    @QueryMapping
    public List<Author> authorsByStatus(@Argument String status) {
        return authorRepository.findByStatus(status);
    }


    @SchemaMapping
    public Author author(Book book){
        Author author = authorRepository.findById(book.getAuthorId()).orElseThrow(null);
        return author;
    }
}
