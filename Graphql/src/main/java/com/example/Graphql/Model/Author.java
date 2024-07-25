package com.example.Graphql.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Author {
    @Id
    private int id;

    private String firstName;

    private String lastName;

    private String status;

}
