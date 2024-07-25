package com.example.Graphql.Controller;

import com.example.Graphql.Model.Author;
import com.example.Graphql.Model.Book;
import com.example.Graphql.Repository.AuthorRepository;
import com.example.Graphql.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.stereotype.Controller;

@Controller
public class MutationController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @MutationMapping
    public Author createAuthor(@Argument int id, @Argument String firstName, @Argument String lastName, @Argument String status) {
        Author author = new Author(id, firstName, lastName, status);
        return authorRepository.save(author);
    }

    @MutationMapping
    public Book createBook(@Argument int id, @Argument String name, @Argument String pageCount, @Argument int authorId) {
        Book book = new Book(id, name, pageCount, authorId);
        return bookRepository.save(book);
    }
}

