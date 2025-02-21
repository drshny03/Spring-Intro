package com.capgeminitrainning.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBridgeLabzController {

    @ResponseBody
    @GetMapping("/hellobridgelab")
    public String helloApi()
    {
        return "<html><body><h1>Hello from BridgeLabz</h1></body></html>";
    }
}
