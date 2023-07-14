package com.morozov.projects.bookstore_xsoft_task.service.impl;

import com.morozov.projects.bookstore_xsoft_task.model.Category;
import com.morozov.projects.bookstore_xsoft_task.repository.CategoryRepository;
import com.morozov.projects.bookstore_xsoft_task.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public void saveCategory(String categoryName) {
        //TODO
        if(!categoryRepository.findByName(categoryName)) {
            categoryRepository.save(new Category(categoryName));
        } else {
            //throw new ...
        }


    }
}
