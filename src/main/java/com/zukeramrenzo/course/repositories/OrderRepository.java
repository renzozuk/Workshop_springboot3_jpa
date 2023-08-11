package com.zukeramrenzo.course.repositories;

import com.zukeramrenzo.course.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
