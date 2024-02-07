package com.anagabrieladev.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/first")
public class FirstController {

    @GetMapping("/")
    public User main(String[] args) {
        User user = new User("gaby", 20);
        return user;
    }

    @PostMapping("/create")
    public String create() {
        return "User created";
    }

    record User(String name, int age) {
    }

}
