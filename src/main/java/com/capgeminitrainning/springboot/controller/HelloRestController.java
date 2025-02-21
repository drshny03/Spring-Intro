package com.capgeminitrainning.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {

    @GetMapping("/")
    public String helloApi()
    {
        return "Hello From BridgeLabz";
    }
}
