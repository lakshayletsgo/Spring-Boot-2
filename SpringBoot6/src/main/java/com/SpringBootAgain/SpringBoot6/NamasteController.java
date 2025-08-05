package com.SpringBootAgain.SpringBoot6;


import org.springframework.web.bind.annotation.*;

@RestController
public class NamasteController {

    @GetMapping("/namaste/{caste}/ramRam")
    public NamasteResponse namasteGet(@PathVariable String caste){
        return new NamasteResponse("Ram Ram "+caste+" ji");
    }

    @PostMapping("/namaste")
    public NamasteResponse namastePost(@RequestBody String name){
        return new NamasteResponse("Namaste "+name+" !");
    }
}
