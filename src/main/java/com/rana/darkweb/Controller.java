package com.rana.darkweb;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController  // Marks this class as a REST controller
public class Controller {

    @GetMapping("/")  // Maps HTTP GET requests to "/"
    public String home() {
        return "Darkweb app is running!";
    }
}
