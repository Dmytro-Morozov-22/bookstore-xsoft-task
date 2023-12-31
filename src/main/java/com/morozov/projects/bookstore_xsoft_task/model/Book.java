package com.morozov.projects.bookstore_xsoft_task.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "books")
@NoArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "description", nullable = false)
    private String description;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    @JsonIgnore
    private User user;

    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "id")
    @JsonIgnore
    private Category category;

//    @OneToMany(mappedBy = "book", cascade = CascadeType.REMOVE)
//    @JsonIgnore
//    private List<Category> category;

    public Book(String name, String author, String description, User user, Category category) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.user = user;
        this.category = category;
    }
}
