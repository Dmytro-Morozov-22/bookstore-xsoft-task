package com.morozov.projects.bookstore_xsoft_task.repository;

import com.morozov.projects.bookstore_xsoft_task.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    boolean findByName(String categoryName);
}
