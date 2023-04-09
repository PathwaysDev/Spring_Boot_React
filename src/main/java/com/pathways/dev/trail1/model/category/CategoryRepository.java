package com.pathways.dev.trail1.model.category;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.pathways.dev.trail1.model.category.Category;


@Repository
public interface CategoryRepository extends JpaRepository <Category, String>{
}
