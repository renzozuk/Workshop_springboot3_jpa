package com.zukeramrenzo.course.repositories;

import com.zukeramrenzo.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
