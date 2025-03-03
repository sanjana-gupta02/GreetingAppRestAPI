package com.spring.RestAPI.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @GetMapping
    public GreetingResponse getGreeting() {
        return new GreetingResponse("Hello, this is a GET request!", null);
    }

    @PostMapping
    public GreetingResponse postGreeting(@RequestBody String name) {
        return new GreetingResponse("Hello, this is a POST request!", name);
    }

    @PutMapping
    public GreetingResponse putGreeting(@RequestBody String name) {
        return new GreetingResponse("Hello, this is a PUT request!", name);
    }

    @DeleteMapping
    public GreetingResponse deleteGreeting() {
        return new GreetingResponse("Hello, this is a DELETE request!", null);
    }

    public record GreetingResponse(String message, String name) {}
}
