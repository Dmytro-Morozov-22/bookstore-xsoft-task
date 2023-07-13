package com.morozov.projects.bookstore_xsoft_task.repository;

import com.morozov.projects.bookstore_xsoft_task.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
