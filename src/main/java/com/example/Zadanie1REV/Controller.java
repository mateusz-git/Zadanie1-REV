package com.example.Zadanie1REV;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/rev")
    public String rev(@RequestParam String string) {
        return new StringBuilder(string).reverse().toString();
    }
}
