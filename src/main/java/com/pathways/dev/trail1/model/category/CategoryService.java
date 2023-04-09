package com.pathways.dev.trail1.model.category;

import com.pathways.dev.trail1.model.category.Category;

import java.util.Collection;
import java.util.Optional;

public interface CategoryService {
    Collection<Category> findAll();

    void save(Category contactSubmission);

    Optional< Category > findById(Long id);

    void delete(long id);
}
