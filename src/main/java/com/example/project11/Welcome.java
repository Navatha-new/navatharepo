package com.example.project11;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    @GetMapping("/welcome")
    public String welcomehome(){
        String msg="WELCOME NAVATHA !!!!";
        return msg;
    }
    @GetMapping("/greet")
    public String greet(){
        String msg="Hello good morning";
        return msg;
    }
}
