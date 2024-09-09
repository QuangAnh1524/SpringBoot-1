package com.quanh1524.hello_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringController {
    @GetMapping("/Hello")
    String sayHello() {
        return "Hello World!";
    }
}
