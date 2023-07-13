package com.morozov.projects.bookstore_xsoft_task.service.impl;

import com.morozov.projects.bookstore_xsoft_task.dto.BookDto;
import com.morozov.projects.bookstore_xsoft_task.model.Book;
import com.morozov.projects.bookstore_xsoft_task.model.User;
import com.morozov.projects.bookstore_xsoft_task.repository.BookRepository;
import com.morozov.projects.bookstore_xsoft_task.repository.UserRepository;
import com.morozov.projects.bookstore_xsoft_task.service.BookService;
import com.morozov.projects.bookstore_xsoft_task.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private UserService userService;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BookRepository bookRepository;

    @Override
    public void saveBook(BookDto bookDto) {
        User user = userRepository.findByEmail(userService.getCurrentUser());
        Book book = new Book(bookDto.getName(),
                bookDto.getAuthor(), bookDto.getDescription(), user);

        bookRepository.save(book);
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteById(id);
    }

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }
}
