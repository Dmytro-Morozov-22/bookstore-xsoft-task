package com.morozov.projects.bookstore_xsoft_task.service;

import com.morozov.projects.bookstore_xsoft_task.dto.UserDto;
import com.morozov.projects.bookstore_xsoft_task.model.User;

public interface UserService {
    void saveUser(UserDto userDto);
//    List<User> getAll();
    User findUserByEmail(String email);
//    User findById(Long id);
//    void delete(Long id);
    String getCurrentUser();
}

