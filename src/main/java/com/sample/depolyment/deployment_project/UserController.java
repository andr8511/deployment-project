package com.sample.depolyment.deployment_project;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {


    Map<String, String> users = new HashMap<>();

   @GetMapping()
    public Map<String, String> getAllUsers(){
       buildUsers();
       return users;
   }

    @GetMapping("hello-world")
    public String helloWorld(){
        return "Hello World!";
    }

    private void buildUsers() {
        users.put("Andrey", "Hey!");
        users.put("Oksana", "How are you?");
    }
}
