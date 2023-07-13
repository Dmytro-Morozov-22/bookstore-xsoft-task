package com.morozov.projects.bookstore_xsoft_task.service;

import com.morozov.projects.bookstore_xsoft_task.dto.BookDto;
import com.morozov.projects.bookstore_xsoft_task.model.Book;

import java.util.List;

public interface BookService {
    void saveBook(BookDto bookDto);
    void deleteBook(Long id);
    List<Book> getAllBook();
}
