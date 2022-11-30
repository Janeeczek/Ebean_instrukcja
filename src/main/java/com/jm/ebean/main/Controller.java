package com.jm.ebean.main;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class Controller {
    private final MyService service;

    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

}
