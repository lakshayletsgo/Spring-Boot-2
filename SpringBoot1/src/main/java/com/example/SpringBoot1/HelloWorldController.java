package com.example.SpringBoot1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {



    @GetMapping(path = "/whatsup")
    public String kyaHaalHai(){
        return "Kya Haal Hai Bhai K?";
    }
}
