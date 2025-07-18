package com.example.project11;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {
    public String welcomehome(){
        String msg="WELCOME NAVATHA garu!!!!";
        return msg;
    }
}
