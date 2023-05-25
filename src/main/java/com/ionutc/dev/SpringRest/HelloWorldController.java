package com.ionutc.dev.SpringRest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //GET HTTP Method

    @GetMapping("/hello")
    public String helloWorld(){
        return "Hello !";
    }

}
