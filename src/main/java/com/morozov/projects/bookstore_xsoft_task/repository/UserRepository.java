package com.morozov.projects.bookstore_xsoft_task.repository;

import com.morozov.projects.bookstore_xsoft_task.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByEmail(String email);
}
