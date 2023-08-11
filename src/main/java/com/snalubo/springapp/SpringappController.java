package com.snalubo.springapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class SpringappController {

    @RequestMapping("/{id}")
    public String helloworld(@PathVariable int id) {
        return "Hello " + id;
    }
}
