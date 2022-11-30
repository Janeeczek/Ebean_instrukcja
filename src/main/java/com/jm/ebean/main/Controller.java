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
    @GetMapping("/allCars")
    public String all() {
        //var allcars = service.allCars();
        return "allCars";
    }
    @GetMapping("/putEngine")
    public String putEngine() {
        var engine = service.addEngine();
        return "putEngine";
    }
    @GetMapping("/removeEngine/{id}")
    public String removeEngine(@PathVariable int id) {
       // var engine = service.removeEngine(id);
        return "removeEngine";
    }
}
