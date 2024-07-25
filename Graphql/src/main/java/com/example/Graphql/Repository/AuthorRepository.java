package com.example.Graphql.Repository;

import com.example.Graphql.Model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AuthorRepository extends JpaRepository<Author,Integer> {

    List<Author> findByStatus(String status);
}
