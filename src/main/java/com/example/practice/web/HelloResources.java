package com.example.practice.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.practice.service.logic.GreetingService;

@RestController
public class HelloResources {
    
    private GreetingService greetingService;

    public HelloResources(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return greetingService.sayGreeting();
    }
}
