package com.zukeramrenzo.course.repositories;

import com.zukeramrenzo.course.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
