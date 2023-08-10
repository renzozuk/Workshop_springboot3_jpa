package com.zukeramrenzo.course.resources;

import com.zukeramrenzo.course.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
    @GetMapping
    public ResponseEntity<User> findAll(){
        User u = new User(1L, "João", "joao@gmail.com", "+55(69)91111-1111", "12345");
        return ResponseEntity.ok().body(u);
    }
}
