package com.example.SpringBoot2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherController {

    @GetMapping(path = "/help")
    public String secondController(){
        return "Yeh hai second controller";
    }
}
