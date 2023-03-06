package com.example.sayHello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class SimpleController {
    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello world";
    }

    @PostMapping("/hello/name")
    public String helloName(@RequestBody String name) {
        return "Hello " + name;
    }

}
