package com.zukeramrenzo.course.repositories;

import com.zukeramrenzo.course.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
