package com.sample.depolyment.deployment_project;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/naa")
public class NaumController {

    @GetMapping()
    public String hello1Page(){
        return "Hello naa1";
    }

    @GetMapping("/")
    public String hello2Page(){
        return "Hello naa2";
    }
}
